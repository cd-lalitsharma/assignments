import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReLocks{
    Lock lock = new ReentrantLock(true);
    Condition c = lock.newCondition();
    
    void worker1(){
    
        System.out.println("worker1 waiting");
        lock.lock();
        System.out.println("worker1 waiting");
        
        try {
            c.await();
    
            System.out.println("Worker 1 resuming");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
    void worker2(){
        lock.lock();
        System.out.println("worker 2 starting");
        System.out.println("worker 2 signaling worker 1");
       
        c.signal();
        lock.unlock();
        
    }
    
}

public class Question_15 {
    
    public static void main(String[] args) {
        System.out.println("Q.Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().");
        ReLocks r = new ReLocks();
        
        Thread a  = new Thread(new Runnable() {
            @Override
            public void run() {
                r.worker1();
        
            }
        });
        
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                r.worker2();
        
            }
        });
        
        a.start();
        b.start();
    }
}
