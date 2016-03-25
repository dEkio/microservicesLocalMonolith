package com.spring.netflix;

import com.spring.netflix.service1.Config;
import com.spring.netflix.service2.ConfService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@Import({Config.class, ConfService2.class})
public class MonolithApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "monolith");
        SpringApplication.run(MonolithApplication.class, args);
    }
}
