package com.yplus.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("course-service")
public interface CourseService {

    @RequestMapping("/test")
    String test();

}
