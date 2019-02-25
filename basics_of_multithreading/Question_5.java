import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question_5 {
    public static void main(String[] args) {
        System.out.println("Q. Use isShutDown() and isTerminate() with ExecutorService.");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running");
        
            }
        });
    
        
        executorService.shutdown();
        if (executorService.isTerminated()){
            System.out.println("Thread Terminated");
        }
        
        if (executorService.isShutdown()){
            System.out.println("Thread shutdown");
        }
        
        
    }
}
