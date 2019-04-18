package com.m.controller;

import com.m.service.FeignTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerFeignController {

    @Autowired
    private FeignTestService feignTestService;

    @RequestMapping("/client")
    public String say() {
        String string = feignTestService.sayHi();
        return string;
    }
}
