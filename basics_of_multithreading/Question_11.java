

public class Question_11 {
     int a=10;
    
    public void product() {
        synchronized(this){
            a*=10;
        }
        System.out.println("Value of a is "+a+ " "+Thread.currentThread().getName());
    
    }
    public static void main(String[] args)  {
        System.out.println("Q. Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.");
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()  {
                new Question_11().product();
            }
        });
    
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                new Question_11().product();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
    }
}
