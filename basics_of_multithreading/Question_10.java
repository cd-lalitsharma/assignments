import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question_10 {
    
     static int count=0;
    synchronized  static void changeInt(){
        count+=1;
        
    
    }
    
    public static void main(String[] args) {
        System.out.println("Q. Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.");
    
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        for (int i=0;i<10;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
            
                    Question_10.changeInt();
                    System.out.println("Value of count is "+count);
                   
                }
            });
        }
       
        
        executorService.shutdown();
    }

}
