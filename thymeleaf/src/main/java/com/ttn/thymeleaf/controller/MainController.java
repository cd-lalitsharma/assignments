package com.ttn.thymeleaf.controller;

import com.ttn.thymeleaf.entity.Employee;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
public class MainController {
    
    List<String> list  = new ArrayList<>();
    
    @GetMapping("hello")
    public ModelAndView helloworld(){
        
        
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("helloworld");
        return modelAndView;
    }
    @GetMapping("/alert")
    public ModelAndView alertController(){
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("alert");
        modelAndView.addObject("heading","click button for alert box");
        modelAndView.addObject("title","alert demo");
        return modelAndView;
    }
    
    @GetMapping("empform")
    public ModelAndView showEmpForm(){
        
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("employee_form");
        modelAndView.addObject("employee",new Employee());
        return modelAndView;
    }
    
    @PostMapping("empHandler")
    public ModelAndView emphandler(@ModelAttribute Employee employee){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employee");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
    
    
    @GetMapping("isAdmin")
    public ModelAndView isAdminRender(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("isAdmin");
        modelAndView.addObject("employee",new Employee());
        
        return modelAndView;
    }
    
    @PostMapping("isAdminHandler")
    public ModelAndView isAdminHandler(@ModelAttribute Employee employee){
    
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employee",employee);
        System.out.println(employee);
        modelAndView.setViewName("adminIdentifier");
        return modelAndView;
    
    }
    
    @GetMapping("splitHeader")
    public ModelAndView splitHeader(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("headerFooter");
        modelAndView.addObject("message","page with split header and footer");
        return modelAndView;
    }
    
    @GetMapping("ajaxTime")
    public ModelAndView ajaxtime(){
        
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("ajaxTime");
    
        System.out.println("called");
        return  modelAndView;
    
    }
    
    
    @GetMapping("getTime")
    public String getTime(){
    
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        String time = simpleDateFormat.format(cal.getTime());
        return time;
    }
    
    @GetMapping("/conditionalTag")
    public ModelAndView conditionalTag(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("conditionalTag");
        return modelAndView;
    }
    
    @PostMapping("/condition")
    public ModelAndView condition(@RequestParam String name){
    
        ModelAndView modelAndView = new ModelAndView();
        if (!name.isEmpty()){
    
            list.add(name);
        }
    
        modelAndView.addObject("name",list);
        modelAndView.setViewName("conditionalTag");
        return modelAndView;
    }
    
    @GetMapping("enm")
    public ModelAndView enm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("enum");
        return modelAndView;
    }
    
    @GetMapping("loader")
    public ModelAndView loader(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("loader");
        return modelAndView;
    }
    
    @PostMapping("ajaxCall")
    public String ajaxcall(@RequestParam String firstName,String lastName) throws InterruptedException {
        Thread.sleep(2000);
        return "full name is"+firstName+" "+lastName;
    }
    
}
