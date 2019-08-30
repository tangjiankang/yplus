package com.yplus.oauth2.mapper;


import com.yplus.oauth2.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * 自定义实现按用户名查找用户信息
 */
@Mapper
public interface UserMapper{
    User queryUserByUsername(String username);
}
