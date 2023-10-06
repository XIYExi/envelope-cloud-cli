package com.envelope.common.translation.core.impl;


import com.envelope.common.translation.annotation.TranslationType;
import com.envelope.common.translation.constant.TransConstant;
import com.envelope.common.translation.core.TranslationInterface;
import com.envelope.resource.api.RemoteFileService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;

/**
 * OSS翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.OSS_ID_TO_URL)
public class OssUrlTranslationImpl implements TranslationInterface<String> {

    @DubboReference
    private RemoteFileService ossService;

    @Override
    public String translation(Object key, String other) {
        return ossService.selectUrlByIds(key.toString());
    }
}
