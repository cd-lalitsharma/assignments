package com.ttn.thymeleaf.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Employee {
    String name;
    Integer age;
    Integer id;
    String department;
    Boolean isAdmin;
    
    public Boolean getAdmin() {
        return isAdmin;
    }
    
    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
