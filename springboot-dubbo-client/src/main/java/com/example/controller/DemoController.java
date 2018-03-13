package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmcc on 18-3-13.
 */
@RestController
public class DemoController {
    @Reference(version = "1.0.0")
    private DemoService demoService1;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        System.out.println("ddddd");
        return demoService1.sayHello(name);
    }
}
