package com.hsbc.controller;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "kenny") String name) {
        return "hello " + name + ", i am from port:" + port;
    }

}
