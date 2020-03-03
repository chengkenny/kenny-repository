package com.hsbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProviderSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderSimpleApplication.class, args);
    }

}
