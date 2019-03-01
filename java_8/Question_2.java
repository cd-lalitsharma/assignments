@FunctionalInterface
interface ReturnOne{
    int returnOneParameter(int a, int b);
}

public class Question_2 {
    public static void main(String[] args) {
        //Create a functional interface whose method takes 2 integers and return one integer.
    
        System.out.println("returned integer is "+ ((ReturnOne) (a,b)->a+b).returnOneParameter(5,4));
    }
}
