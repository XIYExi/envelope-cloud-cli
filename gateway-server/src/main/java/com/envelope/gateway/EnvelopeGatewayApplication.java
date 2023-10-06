package com.envelope.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

/**
 * 网关启动程序
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EnvelopeGatewayApplication {

    public static void main(String[] args) {
        // 标记 sentinel 类型为 网关
        System.setProperty("csp.sentinel.app.type", "1");

        SpringApplication application = new SpringApplication(EnvelopeGatewayApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);

        System.out.println("\033[33m (づ●─●)づ   网关已经部署 -> localhost:8080   \033[33m");
    }

}
