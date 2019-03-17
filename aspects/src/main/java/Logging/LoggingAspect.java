package Logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspect {

    @Around("execution(public void display())" )
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("running before advice");
        proceedingJoinPoint.proceed();
        System.out.println("running after advice");
    }
    
    @AfterReturning(pointcut = "execution(public Integer getInteger())", returning = "returnValue")
    void afterReturningAspect(Integer returnValue){
        System.out.println(returnValue);
    }
    
    
    
    
    @Pointcut("this(Logging.Service) ")
    void pointCut(){}
    
    
    @Before("pointCut()")
    void beforeAspect(JoinPoint joinPoint){
    
        System.out.println();
        System.out.println("a pointcut to log all methods Of services .");
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getSourceLocation());
        System.out.println(joinPoint.getThis());
        System.out.println();
    }
    
    
}
