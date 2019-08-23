package com.yplus.yoga.controller;

import com.yplus.yoga.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AppController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        return "app-controller   "+userService.test();
    }
}