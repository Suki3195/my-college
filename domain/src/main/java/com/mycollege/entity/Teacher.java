package com.mycollege.repository.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class Teacher {
    private UUID teacherId;
    private String name;
    private String contactNumber;
    private String highestEducation;
    private Department department;
    private Course courseOne;
    private Course courseTwo;
    private Course courseThree;
    private Course courseFour;
    private String designation;
    private String payscale;

}
