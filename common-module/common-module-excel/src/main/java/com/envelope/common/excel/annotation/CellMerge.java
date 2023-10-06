package com.envelope.common.excel.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.FIELD)
public @interface CellMerge {

    /**
     * col index
     * @return
     */
    int index() default -1;
}
