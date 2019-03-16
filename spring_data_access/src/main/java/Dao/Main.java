package Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    
    public static void main(String[] args) {
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Dao d =applicationContext.getBean("Dao",Dao.class);
        try {
            d.printUsername();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
