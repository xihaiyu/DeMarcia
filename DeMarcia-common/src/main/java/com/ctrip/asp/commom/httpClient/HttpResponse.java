package com.ctrip.asp.commom.httpClient;

import org.apache.http.Header;

public class HttpResponse {

	private String responseString;
	private int httpCode;
	private Header[] responseHeaders;
	private byte[] responseByte;
	public String getResponseString() {
		return responseString;
	}

	public String getResponseHead(final String headName) {
		for (Header header : responseHeaders) {
			if (header.getValue().equals(headName)) {
				return header.getValue();
			}
		}
		return null;
	}
	public void setResponseString(String responseBody) {
		this.responseString = responseBody;
	}

	public int getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}

	public Header[] getResponseHeaders() {
		return responseHeaders;
	}

	public void setResponseHeaders(Header[] responseHeaders) {
		this.responseHeaders = responseHeaders;
	}

	public byte[] getResponseByte() {
		return responseByte;
	}

	public void setResponseByte(byte[] responseByte) {
		this.responseByte = responseByte;
	}
	
}
