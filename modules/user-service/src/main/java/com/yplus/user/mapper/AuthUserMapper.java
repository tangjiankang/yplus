package com.yplus.user.mapper;

import com.yplus.user.entity.AuthUser;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthUserMapper {


    List<AuthUser> selectAll();

    int updateByPrimaryKey(AuthUser record);
}