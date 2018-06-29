package com.ctrip.asp.commom.spring;
import com.ctrip.asp.commom.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring 工厂
 *
 * @author daihui.gu
 * @create 2015年8月19日
 */
public class SpringBeanFactory implements ApplicationContextAware {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        setContext(applicationContext);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        try {
            return (T) applicationContext.getBean(name);
        } catch (Exception e) {
            LOGGER.error("Spring getBean:" + name, e);
        }
        return null;
    }

    /**
     * 获取某个Bean的对象
     */
    public static <T> T getBean(Class<T> clazz) {
        try {
            return applicationContext.getBean(clazz);
        } catch (Exception e) {
            LOGGER.error("Spring getBean:" + clazz, e);
        }
        return null;
    }

    /**
     * 解决Sonar提示问题，单拉一个方法
     *
     * @param context
     * @author daihui.gu
     */
    private static void setContext(ApplicationContext context) {
        applicationContext = context;
    }
}
