package com.yplus.course.repository;

import com.yplus.common.util.TestUtil;
import com.yplus.course.entity.AuthUser;
import com.yplus.course.mapper.AuthUserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class CourseRepository {

    @Resource
    private AuthUserMapper authUserMapper;

    public List<AuthUser> selectAll(){
        return authUserMapper.selectAll();
    }

    public String test(){
        return TestUtil.test();
    }
}