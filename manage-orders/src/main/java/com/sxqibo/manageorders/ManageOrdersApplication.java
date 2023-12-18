package com.sxqibo.manageorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ManageOrdersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageOrdersApplication.class, args);
    }

}
