package com.example.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.DemoService;

/**
 * Created by cmcc on 18-3-13.
 */
@Service(version="1.0.0",
    application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}")
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        return "hellodsadasdada" + name;
    }
}
