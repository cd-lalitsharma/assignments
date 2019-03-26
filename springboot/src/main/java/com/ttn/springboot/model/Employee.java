package com.ttn.springboot.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    Integer id;
    
    String name;
    String phone;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
