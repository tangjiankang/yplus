package com.yplus.course.service.impl;


import com.yplus.common.core.util.TestUtil;
import com.yplus.common.user.entity.AuthUser;
import com.yplus.course.mapper.AuthUserMapper;
import com.yplus.course.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private AuthUserMapper authUserMapper;

    @Override
    public String test() {
        return TestUtil.test();
    }

    @Override
    public List<AuthUser> selectAll() {
        return authUserMapper.selectAll();
    }
}
