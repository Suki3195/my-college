package com.mycollege.domain.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="current_address")
public class CurrentAddress {

    @Id
    private UUID addressId;
    private String addressLine1;
    private String addressLine2;
    private String landmark;
    private String city;
    private String state;
    private String pinCode;
}
