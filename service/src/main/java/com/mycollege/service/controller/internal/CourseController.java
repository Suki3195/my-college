package com.mycollege.service.controller.internal;

import com.mycollege.domain.entity.Course;
import com.mycollege.domainservice.service.iface.ICourseCreateService;
import com.mycollege.service.domain.request.CourseCreateRequest;
import com.mycollege.service.domain.response.CourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/internal/coursesOffered")

public class CourseController {

    @Autowired
    private ICourseCreateService courseCreateService ;

    public CourseResponse createCoursesOffered(CourseCreateRequest courseCreateRequest){
        Course course = new Course();
        course.setCourseName(courseCreateRequest.getCourseName());
        course.setCode(courseCreateRequest.getCourseCode());
        courseCreateService.createCourse(course);

        return null;
    }



}
