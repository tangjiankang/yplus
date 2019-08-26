package com.yplus.course.controller;

import com.yplus.course.entity.AuthUser;
import com.yplus.course.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CourseController {

    @Resource
    private CourseService courseService;

    @RequestMapping("/test")
    public List<AuthUser> test(){
        return courseService.selectAll();
    }
}
