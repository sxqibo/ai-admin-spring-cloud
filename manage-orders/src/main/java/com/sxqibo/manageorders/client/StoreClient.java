package com.sxqibo.manageorders.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

// 注解内填上 库存微服务的名字 ServiceID
@FeignClient(value = "nacos-store", fallback = StoreClientFallback.class)
@Primary
public interface StoreClient {

    // 库存接口的地址
    @RequestMapping("/store")
    public String storeApi();
}
