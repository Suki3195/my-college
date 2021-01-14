package com.mycollege.repository;

import com.mycollege.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.UUID;

//@Repository
public interface IStudentRepository extends JpaRepository<Student, UUID> {
}
