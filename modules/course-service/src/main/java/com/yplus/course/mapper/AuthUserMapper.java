package com.yplus.course.mapper;

import com.yplus.common.user.entity.AuthUser;

import java.util.List;

public interface AuthUserMapper {

    AuthUser selectByPrimaryKey(Long id);

    List<AuthUser> selectAll();
}