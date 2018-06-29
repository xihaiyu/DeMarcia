package com.ctrip.asp.commom.httpClient;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpec;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class HttpClientFactory extends BasePooledObjectFactory<CloseableHttpClient> {
	private static final int timeout = 5000;
	private static final Logger log = LoggerFactory.getLogger(HttpClientFactory.class);
	//private static final Logger log = LoggerFactory.getLogger(ConfigConstants.pipelineLoggerName);

	@Override
	public CloseableHttpClient create() throws Exception {
		CookieSpecProvider easySpecProvider = new CookieSpecProvider() {
			public CookieSpec create(HttpContext context) {
				return new BrowserCompatSpec() {
					@Override
					public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
					}
				};
			}
		};
		Registry<CookieSpecProvider> r = RegistryBuilder.<CookieSpecProvider> create().register(CookieSpecs.BEST_MATCH, new BestMatchSpecFactory())
				.register(CookieSpecs.BROWSER_COMPATIBILITY, new BrowserCompatSpecFactory()).register("easy", easySpecProvider).build();
		RequestConfig requestConfig = RequestConfig.custom().setCookieSpec("easy").setSocketTimeout(timeout).setConnectTimeout(timeout).build();
		return HttpClients.custom().setConnectionManager(getConnectionManager()).setDefaultRequestConfig(requestConfig).setDefaultCookieSpecRegistry(r)
				.setConnectionReuseStrategy(NoConnectionReuseStrategy.INSTANCE).build();
	}

	private PoolingHttpClientConnectionManager getConnectionManager() {

		PoolingHttpClientConnectionManager connMgr = null;
		SSLContext sslContext = null;
		try {
			SSLContextBuilder builder = SSLContexts.custom();
			builder.loadTrustMaterial(null, new TrustStrategy() {
				@Override
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return true;
				}
			});
			sslContext = builder.build();

			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, new X509HostnameVerifier() {
				@Override
				public void verify(String host, SSLSocket ssl) throws IOException {
				}

				@Override
				public void verify(String host, X509Certificate cert) throws SSLException {
				}

				@Override
				public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
				}

				@Override
				public boolean verify(String s, SSLSession sslSession) {
					return true;
				}
			});

			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create().register("https", sslsf)
					.register("http", PlainConnectionSocketFactory.getSocketFactory()).build();
			connMgr = new PoolingHttpClientConnectionManager(socketFactoryRegistry);

		} catch (Exception e) {
			connMgr = new PoolingHttpClientConnectionManager();
			log.error("error occurred when contruct https client", e);
		}
		return connMgr;

	}

	@Override
	public PooledObject<CloseableHttpClient> wrap(CloseableHttpClient client) {
		return new DefaultPooledObject<CloseableHttpClient>(client);
	}

	@Override
	public void destroyObject(PooledObject<CloseableHttpClient> p) throws Exception {
		p.getObject().close();
	}

	@Override
	public void passivateObject(PooledObject<CloseableHttpClient> p) throws Exception {
	}

}
