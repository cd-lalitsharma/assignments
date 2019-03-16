package Database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
    
//      Get the bean of the class from spring container and print the values of the instance variable.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        DataBase db = applicationContext.getBean("database",DataBase.class);
        System.out.println("Name is "+db.name+" and port is "+db.port);





        
    }
}
