interface level1{
    default void printLevel1(){
        System.out.println("you are on level 1 interface");
    }
}
interface level2 extends level1{
    default void printLevel2(){
        System.out.println("you are on level 2 interface");
    }
}
interface level3 extends level2{
    default void printLevel3(){
        System.out.println("you are on level 3 interface");
    }
}

public class Question_8 implements level3{
    
    public static void main(String[] args) {
        // Implement multiple inheritance with default method inside  interface.
        
        Question_8 obj = new Question_8();
        obj.printLevel1();
        obj.printLevel2();
        obj.printLevel3();
        
    }
}
