package com.envelope.common.encrypt.config;


import com.envelope.common.encrypt.core.EncryptorManager;
import com.envelope.common.encrypt.interceptor.MybatisDecryptInterceptor;
import com.envelope.common.encrypt.interceptor.MybatisEncryptInterceptor;
import com.envelope.common.encrypt.properties.EncryptorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * 加解密配置
 */
@AutoConfiguration
@EnableConfigurationProperties(EncryptorProperties.class)
@ConditionalOnProperty(value = "mybatis-encryptor.enable", havingValue = "true")
public class EncryptorAutoConfiguration {

    @Autowired
    private EncryptorProperties properties;

    @Bean
    public EncryptorManager encryptorManager() {
        return new EncryptorManager();
    }

    @Bean
    public MybatisEncryptInterceptor mybatisEncryptInterceptor(EncryptorManager encryptorManager) {
        return new MybatisEncryptInterceptor(encryptorManager, properties);
    }

    @Bean
    public MybatisDecryptInterceptor mybatisDecryptInterceptor(EncryptorManager encryptorManager) {
        return new MybatisDecryptInterceptor(encryptorManager, properties);
    }
}
