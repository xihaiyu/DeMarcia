package com.ctrip.asp.commom.httpClient;

import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;

public interface Invocable {
	public HttpResponse invoke(CloseableHttpClient httpClient) throws IOException;
}
