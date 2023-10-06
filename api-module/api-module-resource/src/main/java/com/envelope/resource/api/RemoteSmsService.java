package com.envelope.resource.api;


import com.envelope.common.core.exception.ServiceException;
import com.envelope.resource.api.domain.SysSms;

import java.util.LinkedHashMap;

/**
 * 短信服务
 */
public interface RemoteSmsService {

    /**
     * 发送短信
     *
     * @param phones     电话号(多个逗号分割)
     * @param templateId 模板id
     * @param param      模板对应参数
     */
    SysSms send(String phones, String templateId, LinkedHashMap<String, String> param) throws ServiceException;

}
