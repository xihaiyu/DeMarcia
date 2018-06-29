package com.ctrip.asp.commom.exception;


import com.quhuhu.wehotel.webserver.common.resp.common.RspCodeMsg;

/**
 * Http 请求异常
 * 
 * @author daihui.gu
 * @create 2015年8月20日
 */
public class HttpClientException extends RspException {

    private static final long serialVersionUID = 1941985813479868202L;

    // 默认异常返回码
    private static RspCodeMsg defaultCodeMsg = RspCodeMsg.HTTP_EXP;

    public HttpClientException() {
        super(defaultCodeMsg);
    }

    public HttpClientException(String message) {
        super(defaultCodeMsg, message);
    }

    public HttpClientException(String message, Throwable cause) {
        super(defaultCodeMsg, message, cause);
    }

    public HttpClientException(Throwable cause) {
        super(defaultCodeMsg, cause);
    }

    public HttpClientException(RspCodeMsg codeMsg) {
        super(codeMsg);
    }

    public HttpClientException(RspCodeMsg codeMsg, String message) {
        super(codeMsg, message);
    }

    public HttpClientException(RspCodeMsg codeMsg, String message, Throwable cause) {
        super(codeMsg, message, cause);
    }

    public HttpClientException(RspCodeMsg codeMsg, Throwable cause) {
        super(codeMsg, cause);
    }
}
