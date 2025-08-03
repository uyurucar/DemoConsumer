package com.ucaru.consumer.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InputController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/firstPage")
    public String firstPage()
    {
        return "<h1>" + appName + "</h1>";
    }
}
