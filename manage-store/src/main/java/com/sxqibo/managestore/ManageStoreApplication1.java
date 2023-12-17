package com.sxqibo.managestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManageStoreApplication1 {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev1");
        SpringApplication.run(ManageStoreApplication1.class, args);
    }

}
