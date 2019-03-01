interface OverrideDemo{
    default void print(){
        System.out.println("print someething");
    }
}
public class Question_7 implements OverrideDemo{
    @Override
    public void print(){
        System.out.println("Printing using override method");
    }
    public static void main(String[] args) {
        // Override the default method of the interface.
        Question_7 obj = new Question_7();
        obj.print();
    }
}
