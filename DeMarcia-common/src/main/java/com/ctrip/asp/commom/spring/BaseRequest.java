package com.ctrip.asp.commom.spring;

import java.io.Serializable;

/**
 * Created by wwli on 2017/9/18.
 */
public class BaseRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pmsCode;

    private String hotelCode;

    private String channelCode;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getPmsCode() {
        return pmsCode;
    }

    public void setPmsCode(String pmsCode) {
        this.pmsCode = pmsCode;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }
}
