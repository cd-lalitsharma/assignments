package afterThrowingDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
    
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
        
        ExceptionGenerator exceptionGenerator = applicationContext.getBean(ExceptionGenerator.class);
        exceptionGenerator.generateException(5);
    }
    
}
