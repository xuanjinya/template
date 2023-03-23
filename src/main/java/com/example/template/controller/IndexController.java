package com.example.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {                                                   
        return "Hello World!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test Success";
    }

}
