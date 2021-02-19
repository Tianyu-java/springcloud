package com.tianyu.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/get_value")
    public String getValue() {
        return "name : " + name;
    }
}
