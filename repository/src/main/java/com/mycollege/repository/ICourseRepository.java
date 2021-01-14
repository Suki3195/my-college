package com.mycollege.repository;

import com.mycollege.repository.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course, Integer>
{
}
