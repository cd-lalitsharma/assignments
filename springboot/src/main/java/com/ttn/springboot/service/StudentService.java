package com.ttn.springboot.service;

import org.springframework.stereotype.Service;
import com.ttn.springboot.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    
    
    public List<StudentModel> getStudentList(){
        List<StudentModel> studentModelList = new ArrayList<>();
        
        studentModelList.add(new StudentModel(1,"abc"));
        studentModelList.add(new StudentModel(2,"xyz"));
        studentModelList.add(new StudentModel(3,"asd"));
        studentModelList.add(new StudentModel(4,"qwe"));
        
        return studentModelList;
    }

}
