package GetRecord;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    
    public static void main(String[] args) {
    
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
        GetUser getUser = applicationContext.getBean(GetUser.class);
    
        try {
            getUser.userName();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
