package Logging;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class Service {
    public void display(){
        System.out.println("display method");
    }
    
    public void print(){
        System.out.println("print method");
    }
  
    public Integer IntMethod(){
        return 12;
    }
}
