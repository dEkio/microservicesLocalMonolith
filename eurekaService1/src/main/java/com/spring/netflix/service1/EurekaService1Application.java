package com.spring.netflix.service1;

import com.spring.netflix.service2.api.MicroserviceConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Profile("microservice")
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@EnableCircuitBreaker
@Import({MicroserviceConf.class, Config.class})
public class EurekaService1Application {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "microservice");
        SpringApplication.run(EurekaService1Application.class, args);
    }

}


