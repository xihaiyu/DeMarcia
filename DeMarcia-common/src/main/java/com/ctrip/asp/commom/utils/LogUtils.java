package com.ctrip.asp.commom.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * 打印日志相关类，error 会发送报警邮件，其他记录日常的都会记录到 error_logger，但不会发邮件
 *
 * @author daihui.gu
 * @create 2015年8月11日
 */
public class LogUtils {

    private static final Logger console_logger = LoggerFactory.getLogger("console_logger");
    private static final Logger info_logger = LoggerFactory.getLogger("info_logger");
    private static final Logger error_logger = LoggerFactory.getLogger("error_logger");
    private static final Logger error_mail_logger = LoggerFactory.getLogger("error_mail_logger");
    private static final Logger alert_mail_logger = LoggerFactory.getLogger("alert_mail_logger");

    public static void console(String arg) {
        console_logger.info(arg);
    }

    public static void console(String format, Object... args) {
        console_logger.info(format, args);
    }

    public static void info(String arg) {
        info_logger.info(arg);
    }

    public static void info(String format, Object... args) {
        info_logger.info(format, args);
    }

    public static void error(String error) {
        if (error == null) {
            return;
        }
        error_logger.error(error);
    }

    public static void error(String format, Object... args) {
        if (format == null) {
            return;
        }
        error_logger.error(format, args);
    }

    public static void error(Exception e) {
        error_logger.error("", e);
    }

    public static void error(String error, Exception e) {
        error_logger.error(error, e);
    }

    public static void errorMail(String error) {
        if (error == null) {
            return;
        }
        error_mail_logger.error(error);
    }

    public static void errorMail(String format, Object... args) {
        if (format == null) {
            return;
        }
        error_mail_logger.error(format, args);
    }

    public static void errorMail(Exception e) {
        error_mail_logger.error("", e);
    }

    public static void errorMail(String error, Exception e) {
        error_mail_logger.error(error, e);
    }

    public static void alertMail(String content) {
        alert_mail_logger.info(content);
    }

    /**
     * 设置调用方的请求方法入口
     * @param func
     */
    public static void beginTrack(String func) {
        MDC.put("funcTraceId", System.currentTimeMillis() + ":" + func);
    }

    /**
     * 方法说明：清除
     */
    public static void endTrack() {
        MDC.clear();
    }
}