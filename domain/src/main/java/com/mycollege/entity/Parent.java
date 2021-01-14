package com.mycollege.repository.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@Builder
@Data
public class Parent {
    private UUID parentId;
    private String fatherName;
    private String motherName;
    private String fatherProfession;
    private String familyIncome;
    private String contactNumber;

}
