package com.mycollege.domain.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="address")
public class Address{
    @Id
    @GenericGenerator(name="id",strategy = "uuid2")
    private UUID addressId;
    @Column(name= "address_line1")
    private String addressLine1;
    @Column(name= "address_line2")
    private String addressLine2;
    @Column(name= "landmark")
    private String landmark;
    @Column(name= "city")
    private String city;
    @Column(name= "state")
    private String state;
    @Column(name= "pincode")
    private String pinCode;
}
