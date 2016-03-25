package com.spring.netflix.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Profile("microservice")
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@EnableCircuitBreaker
@Import(ConfService2.class)
public class EurekaService2Application {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "microservice");
        SpringApplication.run(EurekaService2Application.class, args);
    }
}

