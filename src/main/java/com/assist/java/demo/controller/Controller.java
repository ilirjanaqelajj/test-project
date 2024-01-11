package com.assist.java.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping
    public String getString(){
        return "test111";
    }

    @GetMapping("/2")
    public String get2(){
        return "test222";
    }

    @GetMapping("/3")
    public String get3(){
        return "test333";
    }

    @GetMapping("/4")
    public String get4(){
        return "test444";
    }

    @GetMapping("/5")
    public String get5(){
        return "workssss";
    }
}
