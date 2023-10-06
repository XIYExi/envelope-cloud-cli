package com.envelope.common.idempotent.config;

import com.envelope.common.idempotent.aspectj.RepeatSubmitAspect;
import com.envelope.common.redis.config.RedisConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 幂等功能配置
 */
@AutoConfiguration(after = RedisConfiguration.class)
public class IdempotentAutoConfiguration {

    @Bean
    public RepeatSubmitAspect repeatSubmitAspect(){
        return new RepeatSubmitAspect();
    }
}
