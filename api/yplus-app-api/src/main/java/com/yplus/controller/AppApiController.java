package com.yplus.controller;

import com.yplus.feign.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AppApiController {

    @Resource
    private CourseService courseService;

    @RequestMapping("/test")
    public String test(){
        return courseService.test();
    }
}
