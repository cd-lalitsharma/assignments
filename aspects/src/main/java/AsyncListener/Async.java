package AsyncListener;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
@Configurable
@EnableAsync
public class Async {
    
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext("AsyncListener");
        ExecutingClass executingClass=configurableApplicationContext.getBean("dummy",ExecutingClass.class);
        executingClass.display();
        
        
    }

}
