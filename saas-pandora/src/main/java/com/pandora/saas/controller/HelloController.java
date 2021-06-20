package com.pandora.saas.controller;

import com.pandora.paas.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author zhangguoq
 **/
@RestController
public class HelloController {
    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
    private String test(@PathVariable String name) {
        return helloService.test(name);
    }

}