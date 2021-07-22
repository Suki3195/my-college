package com.mycollege.service.repository;

import com.mycollege.domain.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ICourseRepository extends JpaRepository<Course, UUID>
{
    Course saveCourse(Course course);
}
