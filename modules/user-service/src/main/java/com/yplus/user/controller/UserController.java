package com.yplus.user.controller;


import com.yplus.user.entity.AuthUser;
import com.yplus.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public List<AuthUser> test(){
        return userService.selectAll();
    }
}
