package com.mycollege.repository.entity;

import lombok.Builder;

import java.util.UUID;
@Builder
public class Student {
    private UUID id;
    private String name;
    private String rollNumber;
    private Address address;
    private String mobileNumber;
    private Parent parent;
    private Hobbies hobbies;
    private Department department;
}
