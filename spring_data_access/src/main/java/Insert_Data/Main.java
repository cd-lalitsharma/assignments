package Insert_Data;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Date;


public class Main {
    
    public static void main(String[] args) {
        int result=0;
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("Insert_Data");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Insert insert= applicationContext.getBean(Insert.class);
        try {
            result =insert.doInsert("test_user","pass","test user",26,new Date());
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result==1){
            System.out.println("Record inserted");
        }else{
            System.out.println("Record not inserted");
        }
    }
}
