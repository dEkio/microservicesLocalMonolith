package com.spring.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonolithApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "monolith");
        SpringApplication.run(MonolithApplication.class, args);
    }
}
