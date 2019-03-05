class Demo{
    static Demo d = new Demo();
    private Demo(){
    
    }
    
    public static Demo getInstance(){
        return d;
    }
    
    public void example(){
        System.out.println("singleton class example");
    }
}

public class Question_1 {
    public static void main(String[] args) {
        //Implement Singleton Design Pattern on a dummy class.
        
        
        //error while creating class object
        //Demo d = new Demo();
        
        
        Demo demo =Demo.getInstance();
        
        demo.example();
    }
}
