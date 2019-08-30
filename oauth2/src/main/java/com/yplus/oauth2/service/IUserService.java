package com.yplus.oauth2.service;

import com.yplus.oauth2.entity.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ltq
 * @since 2019-08-14
 */
public interface IUserService {

    User queryUserByUsername(String username);
}
