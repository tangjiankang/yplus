package com.yplus.user.service.impl;



import com.yplus.user.entity.AuthUser;
import com.yplus.user.repository.UserRepository;
import com.yplus.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public String test() {
        return userRepository.test();
    }

    @Override
    public List<AuthUser> selectAll() {
        return userRepository.selectAll();
    }
}
