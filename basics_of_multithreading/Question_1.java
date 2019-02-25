public class Question_1 extends Thread{
    
    public  void run(){
        System.out.println("running");
    }
    
    
    public static void main(String[] args) {
        System.out.println("Q.Create and Run a Thread using Runnable Interface and Thread class.");
        new Question_1().start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread with runnable interface");
            }
        });
        
        t1.start();
    }
}


