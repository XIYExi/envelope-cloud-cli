package com.envelope.common.satoken.config;

import cn.dev33.satoken.dao.SaTokenDao;
import cn.dev33.satoken.jwt.StpLogicJwtForSimple;
import cn.dev33.satoken.stp.StpInterface;
import cn.dev33.satoken.stp.StpLogic;
import com.envelope.common.satoken.core.dao.PlusSaTokenDao;
import com.envelope.common.satoken.core.service.SaPermissionImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * sa-token 配置
 */
@AutoConfiguration
public class SaTokenConfiguration {

    @Bean
    public StpLogic getStpLoginJwt(){
        return new StpLogicJwtForSimple();
    }

    /**
     * 权限接口实现（使用bean注入方便用户替换）
     */
    @Bean
    public StpInterface stpInterface(){
        return new SaPermissionImpl();
    }

    /**
     * 自定义dao层存储
     */
    @Bean
    public SaTokenDao saTokenDao(){
        return new PlusSaTokenDao();
    }
}
