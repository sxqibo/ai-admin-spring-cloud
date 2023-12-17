package com.sxqibo.managehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManageHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageHelloworldApplication.class, args);
    }

}
