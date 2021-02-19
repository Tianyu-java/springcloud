package com.tianyu.consumer.service.apis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * FeignClient 中的name参数要和配置文件中的spring.application.name 一致
 */
@FeignClient(name = "producer")
public interface TestServicesApis {

    /**
     * 接口中的参数必须使用@RequestParam注解指定名称
     *
     * @param name
     * @return
     */
    @RequestMapping("/test/producer")
    String test(@RequestParam("name") String name);

}
