package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
        
        Restaurant restaurant=applicationContext.getBean(Restaurant.class);
        
       restaurant.prepareHotDrink();
    }
}
