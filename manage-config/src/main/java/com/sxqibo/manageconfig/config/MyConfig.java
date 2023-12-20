package com.sxqibo.manageconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {

    @Value("${my.config.message}")
    private String message;

    public String getMessage() {
        return message;
    }
}