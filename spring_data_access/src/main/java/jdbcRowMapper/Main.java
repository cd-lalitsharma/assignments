package jdbcRowMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        RowMapperClass rowMapper= applicationContext.getBean(RowMapperClass.class);
        User user=rowMapper.getUser();
        System.out.println(user);
    
    }
    
}
