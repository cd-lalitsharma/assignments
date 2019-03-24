package afterThrowingDemo;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect

public class ThrowingAspect {


    @AfterThrowing(pointcut = "execution(* afterThrowingDemo.ExceptionGenerator.*(..))", throwing = "ex")
    void afterThrowing(Exception ex) throws Exception{
        System.out.println("exception occured "+ex);
    }

}
