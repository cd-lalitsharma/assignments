package com.ttn.springboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Database {
    
    @Value("${Database.port}")
    Integer port;
    @Value("${Database.name}")
    String name;
    
    @Override
    public String toString() {
        return port + " "+name;
    }
}
