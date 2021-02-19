package com.tianyu.prodicer.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestServiceController {

    @ResponseBody
    @RequestMapping("/producer")
    public String test(String name) {
        return "I am " + name;
    }
}
