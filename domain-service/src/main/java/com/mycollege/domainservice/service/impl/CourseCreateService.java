package com.mycollege.domainservice.service.impl;

import com.mycollege.domain.entity.Course;
import com.mycollege.domain.response.SuccessResponse;
import com.mycollege.domainservice.service.iface.ICourseCreateService;
import com.mycollege.service.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseCreateService implements ICourseCreateService {

    @Autowired
    private ICourseRepository courseRepository;

    @Override
    public SuccessResponse createCourse(Course courseCreateRequest) {
        courseRepository.saveCourse(courseCreateRequest);
        return null;
    }
}
