package com.spring.netflix.service1;

import com.spring.netflix.Service1Controller;
import com.spring.netflix.Service1Pojo;
import com.spring.netflix.Service2Controller;
import com.spring.netflix.Service2ControllerHystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Service1ControllerImpl implements Service1Controller {

    @Autowired
    private Service2Controller service2ControllerHystrix;

    @Override
    @RequestMapping("/")
    public @ResponseBody
    Service1Pojo getSomePojo() throws Exception {
        return new Service1Pojo(service2ControllerHystrix.getSomePojo().getProp());
    }

}
