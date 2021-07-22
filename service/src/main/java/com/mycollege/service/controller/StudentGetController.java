package com.mycollege.service.controller;

//import com.mycollege.repository.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentGetController {

    @GetMapping("/getStudent")
    public String getStudent(){

        return "Student Recieved and is in MECHANICAL DEPARTMENT";
    }
//    localhost:8080/my-college/getStudent
}
