@FunctionalInterface
interface ReferenceExample{
    int calc(int a,int b);
}
public class Question_3 {
    
    int add(int a, int b){
        return a+b;
    }
    int substract(int a, int b){
        return a-b;
    }
    
    static int multiply(int a, int b){
        return a*b;
    }
    
    public static void main(String[] args) {
        
        //Using (instance) Method reference create and apply add and subtract method
        //and using (Static) Method reference create and apply multiplication method for the functional interface created.
    
        ReferenceExample referenceExample;
        
        //add
        referenceExample = new Question_3()::add;
        System.out.println("1+2 is "+referenceExample.calc(1,2));
        
        //substraction
        referenceExample = new Question_3()::substract;
        System.out.println("1+2 is "+referenceExample.calc(1,2));

        referenceExample = Question_3::multiply;
        System.out.println("Multiplication of 2 and 3 is "+ referenceExample.calc(2,3));
        
        
        
    }
}
