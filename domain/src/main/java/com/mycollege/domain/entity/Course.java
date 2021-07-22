package com.mycollege.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;
@Getter
@Setter
@Builder
@Entity
@Table(name = "course_offered")
public class Course {
    @Id
    private UUID courseId;
    @Column(name="course_name")
    private String  courseName;
    @Column(name="course_code")
    private String code;


}
