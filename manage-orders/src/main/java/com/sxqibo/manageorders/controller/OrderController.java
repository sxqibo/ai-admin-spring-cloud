package com.sxqibo.manageorders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.sxqibo.manageorders.client.StoreClient;

@RestController
public class OrderController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StoreClient storeClient;

    @RequestMapping("/order/template")
    public String orderApi() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-store");
        String path = String.format("http://%s:%s/store", serviceInstance.getHost(), serviceInstance.getPort());
        System.out.println("request path:" + path);
        return restTemplate.getForObject(path, String.class);
    }

    @RequestMapping("/order/feign")
    public String orderApiFeign() {
        return storeClient.storeApi();
    }
}
