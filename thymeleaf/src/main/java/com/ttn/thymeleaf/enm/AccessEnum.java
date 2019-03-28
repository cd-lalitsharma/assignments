package com.ttn.thymeleaf.enm;

public enum AccessEnum {
    USER("user"),
    ADMIN("admin"),
    SUPER_ADMIN("super_admin");
    
    String value;
    
    AccessEnum(String empEmp){
        value=empEmp;
    }
    
    public String getValue(){
        return value;
    }
}
