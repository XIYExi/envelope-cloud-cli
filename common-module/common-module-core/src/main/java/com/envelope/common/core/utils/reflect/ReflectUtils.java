package com.envelope.common.core.utils.reflect;

import cn.hutool.core.util.ReflectUtil;
import com.envelope.common.core.utils.StringUtils;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;


/**
 * 反射工具类，提供调用getter setter方法，访问私有变量，调用私有方法，
 * 支持获取泛型类型Class，被AOP过的真实类
 * 的工具函数
 */
@SuppressWarnings("rawtypes")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReflectUtils extends ReflectUtil {

    private static final String SETTER_PREFIX = "set";

    private static final String GETTER_PREFIX = "get";

    /**
     * 调用getter方法
     * 支持多级，如：对象名。对象名。方法
     */
    @SuppressWarnings("unchecked")
    public static <E> E invokeGetter(Object obj, String propertyName){
        Object object = obj;
        for (String name : StringUtils.split(propertyName, ".")) {
            String getterMethodName = GETTER_PREFIX + StringUtils.capitalize(name);
            object = invoke(object, getterMethodName);
        }
        return (E) object;
    }


    /**
     * 调用setter方法
     */
    public static <E> void invokeGetter(Object obj, String propertyName, E value){
        Object object = obj;
        String[] names = StringUtils.split(propertyName, ".");
        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) {
                String getterMethodName = GETTER_PREFIX + StringUtils.capitalize(names[i]);
                object = invoke(object, getterMethodName);
            } else {
                String setterMethodName = SETTER_PREFIX + StringUtils.capitalize(names[i]);
                Method method = getMethodByName(object.getClass(), setterMethodName);
                invoke(object, method, value);
            }
        }
    }


}
