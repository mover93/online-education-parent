package com.chenming.education.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description: GatewayServiceApplication <br>
 * author: chenming <br>
 * date: 2020/10/17 20:24 <br>
 * version: 1.0 <br>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

}
