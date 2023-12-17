package com.sxqibo.managestore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Value("${server.port}")
    Integer port;

    @RequestMapping("/store")
    public String storeApi() {
        return "调用库存系统，当前的端口是：" + port;
    }
}
