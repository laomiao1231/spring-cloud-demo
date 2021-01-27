package com.m.service.impl;

import com.m.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceImpl implements HystrixService {
    @Override
    public String sayHi() {
        return "sorry error 500";
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        throw new RuntimeException("server down");
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
