package com.m.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name = "eureka-client-1")
public interface FeignTestService {
    @RequestMapping(value = "/client", method = RequestMethod.GET)
    String sayHi();
}
