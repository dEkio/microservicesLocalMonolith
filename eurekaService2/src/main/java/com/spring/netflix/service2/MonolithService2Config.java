package com.spring.netflix.service2;

import com.spring.netflix.Service2Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("monolith")
@Configuration
public class MonolithService2Config {

    @Bean
    public Service2Controller getService2Controller() {
        return new Service2ControllerImpl();
    }

}
