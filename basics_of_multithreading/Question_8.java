
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

public class Question_8 {
    
    private static int a=10;
    
    public static void main(String[] args) {
        System.out.println("Q. Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()");
        
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Scheduling Tasks");
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("running scheduleAtFixedRate after 1 second");

            }
        },1, TimeUnit.SECONDS);
//
        System.out.println("scheduleAtFixedRate");
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running scheduleAtFixedRate on two seconds");
            }
        },2,2,TimeUnit.SECONDS);
        executorService.shutdown();
//        scheduledExecutorService.shutdown();
        
        
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running scheduleWithFixedDelay every second");
        
            }
        },1,1,TimeUnit.SECONDS);
    }
}

