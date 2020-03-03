package com.hsbc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright © 2020 HSBC HOLDINGS PLC. All rights reserved.
 *
 * @classname:
 * @author: Kenny Cheng
 * @date: 2020/3/3
 * @description: TODO
 * @version: 1.0.0
 */
@FeignClient(value = "provider-hystrix")
public interface ConsumerFeignService {

    @RequestMapping(value = "/hystrix", method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
