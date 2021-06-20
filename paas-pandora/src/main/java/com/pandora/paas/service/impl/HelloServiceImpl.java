package com.pandora.paas.service.impl;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.pandora.paas.service.HelloService;

/**
 * @Description
 * @Author zhangguoq
 **/
@HSFProvider(serviceInterface = HelloService.class, serviceVersion = "1.0.0", serviceGroup = "passPandora", serviceName = "helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String test(String name) {
        return "欢迎" + name;
    }
}