package com.ctrip.asp.commom.utils;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.StringWriter;
import java.util.List;

/**
 * JSON 相关的工具类
 *
 * @author daihui.gu
 * @create 2015年8月11日
 */
public class JsonUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final ObjectMapper nonNullMapper = new ObjectMapper();

    static {
        // mapper.setVisibility(JsonMethod.FIELD, Visibility.ANY);
        // 未找到字段不报错
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        nonNullMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 无 null 的mapper
        nonNullMapper.setSerializationInclusion(Inclusion.NON_NULL);
    }

    /**
     * 对象转Json，默认输出 null 值
     *
     * @param obj
     * @return
     */
    public static String toJsonString(Object obj) {
        return toJsonString(obj, false);
    }

    /**
     * 对象转json
     *
     * @param obj
     * @param nonNull 标识是否要讲null字段输出，true表示不输出，false表示输出null
     * @return
     */
    public static String toJsonString(Object obj, boolean nonNull) {
        if (obj == null) {
            return null;
        }
        String json = null;
        StringWriter sw = new StringWriter();
        try {
            JsonGenerator gen = new JsonFactory().createJsonGenerator(sw);
            if (nonNull) {
                nonNullMapper.writeValue(gen, obj);
            } else {
                mapper.writeValue(gen, obj);
            }
            if (gen != null) {
                gen.close();
            }
            json = sw.toString();
        } catch (Exception e) {
            LOGGER.error("JSON 序列化错误", e);
        }
        return json;
    }

    /**
     * 从字符串中解析出 json 对象
     *
     * @param content
     * @param clazz   如果是数组，可以使用 Object[].class
     * @return
     */
    public static <E> E parseObject(String content, Class<E> clazz) {
        if (content == null) {
            return null;
        }
        E obj = null;
        try {
            obj = mapper.readValue(content, clazz);
        } catch (Exception e) {
            LOGGER.error("JSON 反序列化错误", e);
        }
        return obj;
    }

    /**
     * 从字符串中解析出 json 对象
     *
     * @param content
     * @param valueTypeRef 负责类型
     * @return
     */
    public static <E> E parseObject(String content, TypeReference valueTypeRef) {
        if (content == null) {
            return null;
        }
        E obj = null;
        try {
            obj = mapper.readValue(content, valueTypeRef);
        } catch (Exception e) {
            LOGGER.error("JSON 反序列化错误", e);
        }
        return obj;
    }

    /**
     * 从 json 中解析 List
     *
     * @param content
     * @param listType
     * @return
     * @author daihui.gu
     */
    public static <E> List<E> parseList(String content, TypeReference<List<E>> listType) {
        if (content == null) {
            return null;
        }
        List<E> obj = null;
        try {
            obj = mapper.readValue(content, listType);
        } catch (Exception e) {
            LOGGER.error("JSON 反序列化错误", e);
        }
        return obj;
    }


}