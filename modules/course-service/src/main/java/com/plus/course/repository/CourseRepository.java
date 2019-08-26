package com.plus.course.repository;

import com.plus.course.mapper.CourseMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class CourseRepository {
    //@Resource
    //private CourseMapper courseMapper;

    public String test(){
        return "hello world!";
    }
}
