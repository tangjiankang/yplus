package com.yplus.oauth2.service.impl;


import com.yplus.oauth2.entity.User;
import com.yplus.oauth2.mapper.UserMapper;
import com.yplus.oauth2.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ltq
 * @since 2019-08-14
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserByUsername(String username) {
        return userMapper.queryUserByUsername(username);
    }
}
