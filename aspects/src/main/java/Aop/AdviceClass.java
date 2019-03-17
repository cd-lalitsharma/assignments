package Aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AdviceClass {
    @Before("execution(public void display())")
    void beforeAdvice(){
        System.out.println("Running aspect before display");
    }
    
    
}
