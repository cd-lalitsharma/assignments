class TDemo extends Thread{

    public void run(){
        System.out.println("Running thread "+Thread.currentThread().getName());
    }
}

public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Q. Use sleep and join methods with thread.");
        TDemo t1 = new TDemo();
        TDemo t2 = new TDemo();
        
      
 
        try {
            t1.start();
            Thread.sleep(2000);
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        
    }
 
    
    
    
    
}
