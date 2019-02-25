class waitAndNotifyAll{
    
    void worker1(){
        synchronized (this){
            try{
                wait();
                System.out.println("worker 1");
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
    }
    
    void worker2(){
        synchronized (this){
            System.out.println("Called second but executed first");
            
            notifyAll();
        }
        
    }
    
    void worker3(){
        synchronized (this){
            try{
                wait();
                System.out.println("worker 3");
                
                
            }catch(Exception e){
                e.printStackTrace();
    
            }
            
        }
        
    }
    
    void worker4(){
        synchronized (this){
            try{
                wait();
                System.out.println("worker 4");
                
                
            }catch(Exception e){
                e.printStackTrace();
    
            }
            
        }
        
    }
    
   
    
}

public class Question_14 {
    public static void main(String[] args) {
        System.out.println("Q. Coordinate mulitple threads using wait() and notifyAll()");
        waitAndNotifyAll obj=new waitAndNotifyAll();
        Thread  a = new Thread(new Runnable() {
            @Override
            public void run() {
                
                obj.worker1();
                
            }
        });
        
        Thread b= new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker2();
            }
        });
        Thread c= new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker3();
            }
        });
        Thread d= new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker4();
            }
        });
        a.start();
        c.start();
        d.start();
        b.start();
        
    }
}
