interface AccessDemo{
    default void print(){
        System.out.println("default interface method");
    }
    
    static void staticPrint(){
        System.out.println("static interface method");
    }
}

public class Question_6 implements AccessDemo{
    
    public static void main(String[] args) {
        //Create and access default and static method of an interface.
        Question_6 obj = new Question_6();
        obj.print();
        
        //using static method of interface
        AccessDemo.staticPrint();
        
    }
}
