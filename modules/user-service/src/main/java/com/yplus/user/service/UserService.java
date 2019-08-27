package com.yplus.user.service;

import com.yplus.user.entity.AuthUser;

import java.util.List;

public interface UserService {

    String test();

    List<AuthUser> selectAll();

}
