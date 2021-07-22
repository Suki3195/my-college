package com.mycollege.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
@Getter
@Setter
@Builder
@Data
@Entity
@Table(name="parent")
public class Parent {
    @Id
    @GenericGenerator(name = "id",strategy = "uuid2")
    private UUID parentId;
    @Column(name ="father_name")
    private String fatherName;
    @Column(name ="mother_name")
    private String motherName;
    @Column(name ="father_occupation")
    private String fatherOccupation;
    @Column(name ="mother_occupation")
    private String motherProfession;
    @Column(name ="family_income")
    private String familyIncome;
    @Column(name ="contact_number")
    private String contactNumber;
    @ManyToOne
    @JoinColumn(name="address_id")
    private Address address;

}
