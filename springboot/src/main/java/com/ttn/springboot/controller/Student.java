package com.ttn.springboot.controller;

import com.ttn.springboot.model.Database;
import com.ttn.springboot.model.StudentModel;
import com.ttn.springboot.model.User;
import com.ttn.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class Student {
    
    @Autowired
    StudentService studentService;
    @Autowired
    User user;
    
    @Autowired
    Database database;
    
    
    
    @GetMapping("/getStudentList")
    public List<StudentModel> greeting(Model model) {
    
        Logger logger = LoggerFactory.getLogger(Student.class);
        
        model.addAttribute("name", "asdas");
        System.out.println(user.username+ " "+user.password);
        System.out.println(database);
        
        logger.error("get student method executed",new Throwable());
        return studentService.getStudentList();
    }
    
    @GetMapping("/bootstrap")
    public void bootstrapData(){
        System.out.println();
    }
    
}
