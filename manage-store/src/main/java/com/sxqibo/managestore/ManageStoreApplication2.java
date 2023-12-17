package com.sxqibo.managestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManageStoreApplication2 {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev2");
        SpringApplication.run(ManageStoreApplication2.class, args);
    }

}
