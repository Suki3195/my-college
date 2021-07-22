package com.mycollege.domain.entity;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;
@Builder
@Entity
@Table(name="student")
public class Student {
    @Id
    @Column(name="roll_number")
    private String rollNumber;
    @Column (name="student_name")
    private String name;
    private Parent parent;
    private Long contactNumber;

    private EducationalDetails educationalDetails;

    @Column (name="current_address")
    private CurrentAddress currentAddress;
    private AdditionalDetails additionalDetails;

    private String mobileNumber;
    private String bloodGroup;
    private Course course;
}
