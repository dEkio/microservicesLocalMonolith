package com.spring.netflix;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableFeignClients
@Configuration
public class MicroserviceConf {

    @Bean
    public Service2Controller getService2Controller() {
        return new Service2ControllerHystrix();
    }
}
