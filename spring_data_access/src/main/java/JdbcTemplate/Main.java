package JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    
    public static void main(String[] args) {
    
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplateExample jdbcTemplateExample = applicationContext.getBean(JdbcTemplateExample.class);
        jdbcTemplateExample.getUserCount();
    }
}
