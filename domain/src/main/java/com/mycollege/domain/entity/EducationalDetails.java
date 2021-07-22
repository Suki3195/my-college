package com.mycollege.domain.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name="educational_details")
public class EducationalDetails {

    @Id
    private UUID id;
    private String highSchoolMarks;
    private String secondarySchoolMarks;
    private String diploma;


}
