package com.spring.netflix;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SERVICE-2")
public interface Service2FeignController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Service2Pojo getSomePojo() throws Exception;

}
