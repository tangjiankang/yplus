package com.yplus.user.repository;

import com.yplus.common.util.TestUtil;

import com.yplus.user.entity.AuthUser;
import com.yplus.user.mapper.AuthUserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class UserRepository {

    @Resource
    private AuthUserMapper authUserMapper;

    public List<AuthUser> selectAll(){
        //return null;
        return authUserMapper.selectAll();
    }

    public String test(){
        return TestUtil.test();
    }
}