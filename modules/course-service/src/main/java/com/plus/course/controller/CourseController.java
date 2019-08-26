package com.plus.course.controller;

import com.plus.course.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CourseController {

    @Resource
    private CourseService courseService;

    @RequestMapping("/test")
    public String test(){
        return courseService.test();
    }
}
