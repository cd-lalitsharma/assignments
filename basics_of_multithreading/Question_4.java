import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question_4 {
    public static void main(String[] args) {
        System.out.println("Q. Try shutdown() and shutdownNow() and observe the difference.");
    
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("running thread");
            
            }
        });
    
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("running thread");
            
            }
        });
    
    
    
        executorService.shutdown();
        executorService2.shutdownNow();
        executorService2.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("added new thread");
        
            }
        });
    }
}
