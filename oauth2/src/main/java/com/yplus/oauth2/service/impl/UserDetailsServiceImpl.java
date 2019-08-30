package com.yplus.oauth2.service.impl;


import com.yplus.oauth2.entity.AuthUser;
import com.yplus.oauth2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 实现UserDetailsService中的loadUserByUsername方法，用于加载用户数据
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.queryUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        //用户权限列表
        //Collection<? extends GrantedAuthority> authorities = userService.queryUserAuthorities(user.getId());

        List<GrantedAuthority> list = AuthorityUtils.createAuthorityList("USER");
        return new AuthUser(
                user.getId(),
                user.getLoginName(),
                user.getPassword(),
                true,
                true,
                true,
                true,
                list);
    }
}
