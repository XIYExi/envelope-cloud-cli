package com.envelope.common.encrypt.core.encryptor;

import com.envelope.common.encrypt.core.EncryptContext;
import com.envelope.common.encrypt.core.IEncryptor;

/**
 * 所有加密执行者的基类
 */
public abstract class AbstractEncryptor implements IEncryptor {

    public AbstractEncryptor(EncryptContext context) {
        // 用户配置校验与配置注入
    }

}
