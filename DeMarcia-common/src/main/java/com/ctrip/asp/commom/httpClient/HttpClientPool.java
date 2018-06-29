package com.ctrip.asp.commom.httpClient;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class HttpClientPool implements Closeable {
    private static final Logger log = LoggerFactory.getLogger(HttpClientPool.class);

    private final GenericObjectPool<CloseableHttpClient> pool;

    private HttpClientPool() {
        pool = new GenericObjectPool<>(new HttpClientFactory());
        pool.setMaxIdle(50);
        pool.setMinIdle(10);
        pool.setMaxTotal(500);
    }

    private static class InstanceHolder {
        private static final HttpClientPool instance = new HttpClientPool();
    }

    public static HttpClientPool getInstance() {
        return InstanceHolder.instance;
    }

    private HttpResponse invoke(Invocable invocable) {
        CloseableHttpClient httpClient = null;
        HttpResponse result = null;
        try {
            httpClient = pool.borrowObject();
            result = invocable.invoke(httpClient);
        } catch (Exception e) {
            log.error("invoke error", e);
            throw new RuntimeException(e);
        } finally {
            if (httpClient != null)
                pool.returnObject(httpClient);
        }
        return result;
    }

    private HttpResponse doExecute(final HttpRequestBase httpMethod) {
        return invoke(new Invocable() {
            @Override
            public HttpResponse invoke(CloseableHttpClient httpClient) throws IOException  {
                HttpResponse result = new HttpResponse();
                try (CloseableHttpResponse response = httpClient.execute(httpMethod)) {
                    result.setHttpCode(response.getStatusLine().getStatusCode());
                    result.setResponseHeaders(response.getAllHeaders());
                    if (response.getEntity() != null) {
                        if (httpMethod.getFirstHeader("responseByte") != null && Boolean.valueOf(httpMethod.getFirstHeader("responseByte").getValue())) {
                            result.setResponseByte(EntityUtils.toByteArray(response.getEntity()));
                        } else {
                            result.setResponseString(EntityUtils.toString(response.getEntity(), "UTF-8"));
                        }
                    } else {
                        result.setResponseString("");
                    }
                } catch (IOException e) {
                    log.error("execute error", e);
                }
                return result;
            }
        });
    }

    public HttpResponse head(String url, Map<String, String> headers, Map<String, String> params) {
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            log.error("URL format error", e);
            throw new RuntimeException(e);
        }
        RequestBuilder builder = RequestBuilder.head().setUri(uri);
        if (headers != null) {
            for (String name : headers.keySet()) {
                builder.addHeader(name, headers.get(name));
            }
        }
        if (params != null) {
            for (String name : params.keySet()) {
                builder.addParameter(name, params.get(name));
            }
        }
        return doExecute((HttpRequestBase) builder.build());
    }

    public HttpResponse get(String url, Map<String, String> headers, Map<String, String> params) {
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            log.error("URL format error", e);
            throw new RuntimeException(e);
        }
        RequestBuilder builder = RequestBuilder.get().setUri(uri);
        if (headers != null) {
            for (String name : headers.keySet()) {
                builder.addHeader(name, headers.get(name));
            }
        }
        if (params != null) {
            for (String name : params.keySet()) {
                builder.addParameter(name, params.get(name));
            }
        }
        return doExecute((HttpRequestBase) builder.build());
    }

    public HttpResponse post(String url, Map<String, String> headers, byte[] payload) {
    	return this.post(url, headers, null, payload);
    }
    
    public HttpResponse post(String url, Map<String, String> headers, Map<String, String> params, byte[] payload) {
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            log.error("URL format error", e);
            throw new RuntimeException(e);
        }
        RequestBuilder builder = RequestBuilder.post().setUri(uri);
        if (headers != null) {
            for (String name : headers.keySet()) {
                builder.addHeader(name, headers.get(name));
            }
        }
        if (params != null) {
            for (String name : params.keySet()) {
                builder.addParameter(name, params.get(name));
            }
        }
        if (payload != null) {
            ByteArrayEntity entity = new ByteArrayEntity(payload);
            builder.setEntity(entity);
        }
        return doExecute((HttpRequestBase) builder.build());
    }

    @Override
    public void close() {
        pool.close();
    }
}
