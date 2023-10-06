package com.envelope.common.mybatis.annotation;

import java.lang.annotation.*;

/**
 * 数据权重组
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataPermission {

    DataColumn[] value();

}
