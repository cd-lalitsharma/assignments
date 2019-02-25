import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Q.Use a singleThreadExecutor to submit multiple threads.");
    
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread one running");
        
            }
        });
        
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread two running");
        
            }
        });
        
        
        executorService.shutdown();
        
        
    }
}
