package com.hsbc.service;

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
public class ConsumerRibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hiRibbon(String name) {
        return restTemplate.getForObject("http://PROVIDER-SIMPLE/hello?name=" + name, String.class);
    }

}
