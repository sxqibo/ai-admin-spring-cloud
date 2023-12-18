package com.sxqibo.manageorders.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 注解内填上 库存微服务的名字 ServiceID
@FeignClient("nacos-store")
public interface StoreClient {

    // 库存接口的地址
    @RequestMapping("/store")
    String storeApi();
}
