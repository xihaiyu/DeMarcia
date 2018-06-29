package com.ctrip.asp.commom.spring;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by wwli on 2017/10/12.
 */
@XmlRootElement(name = "BaseResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("BaseResponse")
public class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;
//    @XmlAttribute(name = "result")
//    @JsonProperty("result")
//    private Boolean result;


    @XmlAttribute(name = "resultCode")
    @JsonProperty("resultCode")
    private Integer resultCode;


//    @XmlAttribute(name = "resultMsg")
//    @JsonProperty("resultMsg")
//    private String resultMsg;

    @XmlAttribute(name = "message")
    @JsonProperty("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

}
