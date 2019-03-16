package CollectionBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Complex complex = applicationContext.getBean("collectionBean",Complex.class);
        System.out.println(complex.list);
        System.out.println(complex.set);
        System.out.println(complex.map.entrySet().iterator().next());
        for (Object m : complex.map.entrySet()){
        
        }
    }
}
