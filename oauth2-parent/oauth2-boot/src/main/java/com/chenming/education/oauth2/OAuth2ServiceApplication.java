package com.chenming.education.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description: OAuth2ServiceApplication <br>
 * author: chenming <br>
 * date: 2020/10/28 19:57 <br>
 * version: 1.0 <br>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OAuth2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServiceApplication.class, args);
    }
}
