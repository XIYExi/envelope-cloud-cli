package com.envelope.common.dubbo.enumd;


import lombok.AllArgsConstructor;

/**
 * 请求日志泛型
 */
@AllArgsConstructor
public enum RequestLogEnum {

    /**
     * info 基本信息
     */
    INFO,

    /**
     * param 参数信息
     */
    PARAM,

    /**
     *full 全部
     */
    FULL;

}
