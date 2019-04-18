package com.m.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    private static String HI_URL = "http://EUREKA-CLIENT-1";

    @Value("${server.port}")
    String port;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sayHi")
    public String sayHi() {
        String string = restTemplate.getForObject(HI_URL + "/client", String.class);
        return string;
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
