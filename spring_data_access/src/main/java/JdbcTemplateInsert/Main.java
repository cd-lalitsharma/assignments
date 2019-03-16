package JdbcTemplateInsert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplateInsert jdbcTemplateInsert=applicationContext.getBean(JdbcTemplateInsert.class);
        int result =jdbcTemplateInsert.insertRecord(new User(0,"test_username","test_pass","test_name",25,new Date()));
        
        if (result==1){
            System.out.println("Insert success");
        }else {
            System.out.println("Insert unsuccess");
        }
    }
}
