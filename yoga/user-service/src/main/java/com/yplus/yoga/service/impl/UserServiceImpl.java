package com.yplus.yoga.service.impl;

import com.yplus.yoga.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String test() {
        return "service test";
    }
}
