package com.hsbc.controller;

import com.hsbc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2020 HSBC HOLDINGS PLC. All rights reserved.
 *
 * @classname:
 * @author: Kenny Cheng
 * @date: 2020/3/3
 * @description: TODO
 * @version: 1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @RequestMapping("/hi")
    public String index() {
        return service.helloService("kenny");
    }

    @RequestMapping("/hystrix")
    public String foo(@RequestParam String name) {
//        return "hello "+name+"!!";
        return service.helloService(name);
    }

}
