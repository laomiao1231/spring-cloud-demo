package com.m.controller;

import com.m.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/client")
    public String say() {
        String string = hystrixService.sayHi();
        return string;
    }

    @RequestMapping("/board")
    public String board() {
        String string = "hystrix dashboard";
        return string;
    }

    @RequestMapping("/hystrix")
    @HystrixCommand(fallbackMethod = "processHystrix")
    public String hystrix() {
        throw new RuntimeException("没有没有对应的信息");
    }

    public String processHystrix() {
        return new String("没有没有对应的信息,null--@HystrixCommand");
    }
}
