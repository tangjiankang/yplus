package com.plus.course.repository;

import com.yplus.common.util.TestUtil;
import org.springframework.stereotype.Repository;


@Repository
public class CourseRepository {
    public String test(){

        return TestUtil.test();
    }
}
