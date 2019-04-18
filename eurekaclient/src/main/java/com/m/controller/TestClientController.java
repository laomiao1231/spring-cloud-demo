package com.m.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClientController {

    @GetMapping("/client")
    public String sayHi() {
        return "Hi 1";
    }
}
