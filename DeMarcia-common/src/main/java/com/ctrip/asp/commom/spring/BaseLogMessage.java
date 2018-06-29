package com.ctrip.asp.commom.spring;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by wwli on 2017/6/23.
 */
@XmlRootElement(name = "BaseLogMessage")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("BaseLogMessage")
public class BaseLogMessage {

	@XmlAttribute(name = "request")
	@JsonProperty("request")
	private Object request;

	@XmlAttribute(name = "response")
	@JsonProperty("response")
	private Object response;

	@XmlAttribute(name = "costTime")
	@JsonProperty("costTime")
	private Long costTime;

	@XmlAttribute(name = "uniqueID")
	@JsonProperty("uniqueID")
	private String uniqueID;

	public Object getRequest() {
		return request;
	}

	public void setRequest(Object request) {
		this.request = request;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public Long getCostTime() {
		return costTime;
	}

	public void setCostTime(Long costTime) {
		this.costTime = costTime;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
}
