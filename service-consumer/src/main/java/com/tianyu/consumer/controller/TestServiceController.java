package com.tianyu.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.tianyu.consumer.service.apis.TestServicesApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestServiceController {

    @Autowired
    private TestServicesApis testServicesApis;

    @RequestMapping("/get")
    @SentinelResource(value = "SentinelTest")
    public String get(String name) {
        return testServicesApis.test(name);
    }

}
