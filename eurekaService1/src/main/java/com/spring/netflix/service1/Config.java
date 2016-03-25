package com.spring.netflix.service1;

import com.spring.netflix.Service1Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Service1Controller getService1Controller() {
        return new Service1ControllerImpl();
    }

}
