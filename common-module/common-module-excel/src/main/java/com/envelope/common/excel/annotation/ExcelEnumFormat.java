package com.envelope.common.excel.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface ExcelEnumFormat {

    /**
     * 字典枚举类型
     * @return
     */
    Class<? extends Enum<?>> enumClass();

    /**
     * 字典枚举类型中对应的code属性，默认为code
     * @return
     */
    String codeField() default "code";

    /**
     * 字典枚举类中对应的text属性，默认为text
     * @return
     */
    String textField() default "text";

}
