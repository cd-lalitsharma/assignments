import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question_9 {
    static  int count=0;
    public static void main(String[] args) {
        System.out.println("Q. Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().");
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        for (int i=0;i<5;i++){
            executorService1.submit(new Runnable(){
    
    
                @Override
                public void run() {
        
                    System.out.println("Using Single FixedThreadPool");
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        
                }
            }
    );
        }
        for (int i=0;i<5;i++){
            executorService.submit(new Runnable(){
    
    
                @Override
                public void run() {
        
                    System.out.println("using CachedThreadPool ");
                    
        
                }
            }
    );
        }
       
        
        executorService1.shutdown();
        executorService.shutdown();
        
    }

}

