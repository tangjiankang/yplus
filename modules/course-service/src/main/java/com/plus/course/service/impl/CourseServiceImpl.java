package com.plus.course.service.impl;

import com.plus.course.repository.CourseRepository;
import com.plus.course.service.CourseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseRepository courseRepository;

    @Override
    public String test() {
        return courseRepository.test();
    }
}
