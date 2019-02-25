import java.util.concurrent.atomic.AtomicInteger;

public class Question_12 {
    AtomicInteger count = new AtomicInteger();
   
    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }
    
    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }
    
    
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Q. Use Atomic Classes instead of Synchronize method and blocks.");
        
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                    new Question_12().worker1();
        
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                new Question_12().worker2();
        
            }
        });
        
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(new Question_12().count);
    }
}
