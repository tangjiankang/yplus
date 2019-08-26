package com.yplus.course.service.impl;


import com.yplus.course.entity.AuthUser;
import com.yplus.course.repository.CourseRepository;
import com.yplus.course.service.CourseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseRepository courseRepository;

    @Override
    public String test() {
        return courseRepository.test();
    }

    @Override
    public List<AuthUser> selectAll() {
        return courseRepository.selectAll();
    }
}
