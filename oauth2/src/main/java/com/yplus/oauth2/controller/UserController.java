package com.yplus.oauth2.controller;



import com.yplus.oauth2.entity.User;
import com.yplus.oauth2.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * controller module
 */
@RestController
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/test")
    public User slectUser(String name){
        return userService.queryUserByUsername(name);
    }
}
