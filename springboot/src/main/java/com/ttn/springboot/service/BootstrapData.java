package com.ttn.springboot.service;

import com.ttn.springboot.model.StudentModel;
import com.ttn.springboot.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BootstrapData {
 
    @Autowired
    studentRepository StudentRepository;
    
    @EventListener(ApplicationStartedEvent.class)
    public  void init(){
     
    
    
        for (int i = 0; i <10 ; i++) {
           StudentModel studentModel=new StudentModel(i,"name"+i);
            StudentRepository.save(studentModel);
        }
        
        
    
    }
}
