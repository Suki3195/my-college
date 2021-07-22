package com.mycollege.service.domain.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CourseCreateRequest {

    private String courseName;
    private String courseCode;

}
