package com.yplus.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("course-servie")
public interface CourseService {

    @RequestMapping("/test")
    String test();

}
