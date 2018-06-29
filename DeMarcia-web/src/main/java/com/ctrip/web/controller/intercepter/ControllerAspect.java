//package com.ctrip.web.controller.intercepter;
//
//import com.ctrip.ssp.log.logger.NormalLog;
//import com.ctrip.ssp.log.threadLocal.ThreadLocalUtils;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//import java.util.UUID;
//
///**
// * Created by Administrator on 2016/11/1 0001.
// */
//@Component
//@Aspect
//public class ControllerAspect {
//    private static final NormalLog log = NormalLog.getInstance();
//    public ControllerAspect() {}
//
//    @Pointcut("execution(* com.ctrip.ssp.controller.*.*(..))")
//    public void pointcut() {
//    }
//
//    @Around("pointcut()")
//    public Object intercept(ProceedingJoinPoint pjp) {
//        ThreadLocalUtils.set(UUID.randomUUID().toString());
//
//        Object result = null;
//        try {
//            result = pjp.proceed(); //继续执行切面后的业务代码
//        } catch (Throwable e) {
//            log.error("WebApiControllerAspect error", e);
//        } finally{
//            ThreadLocalUtils.remove();
//        }
//
//        return result;
//    }
//}
