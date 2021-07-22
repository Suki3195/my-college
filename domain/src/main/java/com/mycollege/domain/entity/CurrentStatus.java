package com.mycollege.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="current_status")
public class CurrentStatus {

    private List<Subjects> failed;
    private List<Subjects> passed;
    private Integer currentSemester;
    private Double currentScore;
    
}
