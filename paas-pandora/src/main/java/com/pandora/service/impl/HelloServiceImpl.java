package com.pandora.service.impl;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.pandora.service.HelloService;

/**
 * @Description
 * @Author zhangguoq
 **/
@HSFProvider(serviceInterface = HelloService.class, serviceVersion = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String test(String name) {
        return name;
    }
}