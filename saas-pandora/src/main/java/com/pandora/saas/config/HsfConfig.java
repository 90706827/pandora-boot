package com.pandora.saas.config;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.pandora.paas.service.HelloService;
import org.springframework.context.annotation.Configuration;

/**
 * @Description Hsf客户端
 * @Author zhangguoq
 **/
@Configuration
public class HsfConfig {

    @HSFConsumer(clientTimeout = 3000, serviceVersion = "1.0.0",serviceGroup = "passPandora")
    public HelloService helloService;

}