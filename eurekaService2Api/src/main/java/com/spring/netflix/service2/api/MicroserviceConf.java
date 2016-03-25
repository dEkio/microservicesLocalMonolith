package com.spring.netflix.service2.api;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients
@Configuration
public class MicroserviceConf {

    @Bean
    public Service2Controller getService2Controller() {
        return new Service2ControllerHystrix();
    }
}
