package com.hsbc.controller;

import com.hsbc.service.ConsumerRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    ConsumerRibbonService consumerRibbonService;

    @GetMapping("/hi")
    public String hiRobbin(@RequestParam String name) {
        return consumerRibbonService.hiRibbon(name);
    }
}
