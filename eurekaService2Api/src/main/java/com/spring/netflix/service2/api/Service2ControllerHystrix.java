package com.spring.netflix.service2.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service2ControllerHystrix implements Service2Controller {

    @Autowired
    private Service2FeignController helloClient;

    @HystrixCommand(fallbackMethod = "defaultHello")
    public Service2Pojo getSomePojo() throws Exception {
        try {
            return helloClient.getSomePojo();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public Service2Pojo defaultHello() {
        return new Service2Pojo("Hello World");
    }

}
