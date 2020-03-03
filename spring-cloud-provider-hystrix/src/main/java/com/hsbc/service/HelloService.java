package com.hsbc.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.ServiceMode;

/**
 * Copyright © 2020 HSBC HOLDINGS PLC. All rights reserved.
 *
 * @classname:
 * @author: Kenny Cheng
 * @date: 2020/3/3
 * @description: TODO
 * @version: 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://PROVIDER-SIMPLE/hello?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hi, " + name + ", sorry, error!";
    }

}
