package com.spring.netflix.service2;

import com.spring.netflix.service2.api.Service2Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
public class ConfService2 {
    @Bean
    public Service2Controller getService2Controller() {
        return new Service2ControllerImpl();
    }
}
