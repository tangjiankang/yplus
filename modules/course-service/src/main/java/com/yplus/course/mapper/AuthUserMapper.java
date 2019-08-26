package com.yplus.course.mapper;

import com.yplus.course.entity.AuthUser;
import java.util.List;

public interface AuthUserMapper {

    AuthUser selectByPrimaryKey(Long id);

    List<AuthUser> selectAll();
}