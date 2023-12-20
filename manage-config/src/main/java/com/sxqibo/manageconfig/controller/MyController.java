package com.sxqibo.manageconfig.controller;

import com.sxqibo.manageconfig.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyConfig myConfig;

    @RequestMapping("/message")
    public String getMessage() {
        return myConfig.getMessage();
    }
}
