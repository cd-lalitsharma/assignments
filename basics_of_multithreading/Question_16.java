import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Deadlock{
    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);
    
    void worker1(){
        
        lock1.lock();
        System.out.println(" in worker 1 lock 1");
        lock2.lock();
        System.out.println(" in worker 1 lock 2");
        lock2.unlock();
        lock1.unlock();
    
    }
    
    void worker2(){
    
        lock2.lock();
    
        System.out.println(" in worker 2 lock 2");
        lock1.lock();
        System.out.println(" in worker 2 lock 1");
        lock2.unlock();
        lock1.unlock();
    
    }
    
    void worker3(){
        aquirelock(lock1,lock2);
        System.out.println("In worker 3");
        lock1.unlock();
        lock2.unlock();
    }
    
    void worker4(){
        aquirelock(lock1,lock2);
        System.out.println("In worker 4");
        lock1.unlock();
        lock2.unlock();
    }
    
    public void aquirelock(Lock lock1,Lock lock2){
        boolean avail1= lock1.tryLock();
        boolean avail2=  lock2.tryLock();
        if (avail1 && avail2){
            return;
        }
        
        if (avail1==true){
            lock1.unlock();
        }
        
        if (avail2==true){
            lock2.unlock();
        }
    
    }
}
public class Question_16 {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Q. Create a deadlock and Resolve it using tryLock().");
        
        Deadlock d= new Deadlock();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                d.worker1();
        
            }
        });
    
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                d.worker2();
            
            }
        });
        
        a.start();
        b.start();
        a.stop();
        b.stop();
    
    
        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                d.worker3();
            
            }
        });
    
        Thread e = new Thread(new Runnable() {
            @Override
            public void run() {
                d.worker4();
            
            }
        });
        c.start();
        e.start();
    
    }
}
