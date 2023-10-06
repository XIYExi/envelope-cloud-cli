package com.envelope.common.excel.annotation;

import com.envelope.common.core.utils.StringUtils;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.FIELD})
public @interface ExcelDictFormat {

    /**
     * 如果是字典类型，请设置字典的type值（如：sys_user_sex)
     * @return
     */
    String dictType() default "";

    /**
     * 按表达式读取内容 (如：0=男，1=女，2=位置）
     * @return
     */
    String readConverterExp() default "";

    /**
     * 分隔符，读取字符串组的内容
     * @return
     */
    String separator() default StringUtils.SEPARATOR;
}
