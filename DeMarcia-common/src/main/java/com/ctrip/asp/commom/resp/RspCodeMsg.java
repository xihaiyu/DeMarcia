package com.ctrip.asp.commom.resp;

/**
 * 响应码及说明定义
 *
 * @author daihui.gu
 * @create 2015年8月19日
 */
public enum RspCodeMsg {
    // 0 开头表示基本成功失败状态
    SUCCESS(0, "处理成功"), //
    FAIL(0001, "处理失败"), //
    NULL(0002, "结果为null"), //
    ERROE_WAIT(0003, "正在处理，请稍后查看处理结果。"), //
    UNKNOWN_ERR(9999, "未知错误"); //

    private Integer code;
    private String msg;

    RspCodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code搜索RspCodeMsg实例
     *
     * @param code 状态码
     * @return 状态实例，可能为null
     */
    public static RspCodeMsg find(Integer code) {
        RspCodeMsg result = null;
        for (RspCodeMsg rsp : RspCodeMsg.values()) {
            if (rsp.getCode().equals(code)) {
                result = rsp;
            }
        }
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return code + "-" + msg;
    }
}
