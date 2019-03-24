import CustomListener.CustomEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenerMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext= new ClassPathXmlApplicationContext("spring.xml");
        
        ListenerExample listenerExample= configurableApplicationContext.getBean("listenerExample",ListenerExample.class);
        
        CustomEventPublisher cp = configurableApplicationContext.getBean("cep",CustomEventPublisher.class);
        cp.publish();
        configurableApplicationContext.start();
        listenerExample.display();
    
     
      
//        configurableApplicationContext.stop();
        
    }
}
