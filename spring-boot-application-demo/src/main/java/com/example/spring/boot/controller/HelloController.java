package com.example.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class HelloController {

    @Value("${welcome.message}")
    private String welcomeMessage;
    @RequestMapping(value = "/hello", method=RequestMethod.GET)
    public String hello() {
        return welcomeMessage;
    }

}
