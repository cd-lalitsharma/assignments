package AsyncListener;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ExecutingClass {
    @Async
    public void display() throws InterruptedException {
        System.out.println("Thread going to sleep");
        Thread.sleep(5500);
        System.out.println("Thread restarted");
        
    }
}
