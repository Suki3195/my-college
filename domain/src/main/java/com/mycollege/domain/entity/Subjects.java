package com.mycollege.domain.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="subject")
public class Subjects {
    @Id
    @GeneratedValue(generator = "uuid")
    @Access(AccessType.PROPERTY)
    @GenericGenerator(name="uuid",strategy = "uuid2")
    @Column(name="id")
    private UUID id;
    @Column(name="subject_name")
    private String subjectName;

    @Column(name="subject_code")
    private String subjectCode;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="course_id")
    private Course course;

    @Column(name="semester")
    private Integer semester;

    @Column(name="points")
    private Integer points;
}
