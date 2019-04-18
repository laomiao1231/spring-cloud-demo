package com.m.service;

import com.m.service.impl.HystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name = "eureka-client-1", fallback = HystrixServiceImpl.class)
public interface HystrixService {
    @RequestMapping(value = "/client", method = RequestMethod.GET)
    String sayHi();
}
