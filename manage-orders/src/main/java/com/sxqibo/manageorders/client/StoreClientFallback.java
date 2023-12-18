package com.sxqibo.manageorders.client;

import org.springframework.stereotype.Component;

@Component
public class StoreClientFallback implements StoreClient{
    @Override
    public String storeApi() {
        return "库存服务异常";
    }
}
