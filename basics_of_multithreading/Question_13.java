class waitAndNotify{
    
    void worker1(){
    synchronized (this){
        try{
            wait();
            System.out.println("Called first but executed second");
        
        
        }catch(Exception e){
            e.printStackTrace();
    
        }
    
    }
   
    }
     void worker2(){
        synchronized (this){
            System.out.println("Called second but executed first");
    
            notify();
        }
       
    }
    
}

public class Question_13 {
    public static void main(String[] args) {
        System.out.println("Q. Coordinate 2 threads using wait() and notify().");
        waitAndNotify obj=new waitAndNotify();
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
        
        a.start();
        b.start();
    }
}
