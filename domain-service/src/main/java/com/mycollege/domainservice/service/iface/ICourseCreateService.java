package com.mycollege.domainservice.service.iface;

import com.mycollege.domain.entity.Course;
import com.mycollege.domain.response.SuccessResponse;

public interface ICourseCreateService {
  SuccessResponse createCourse(Course courseCreateRequest);

}
