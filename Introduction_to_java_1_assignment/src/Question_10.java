public class Question_10 {
    
    static void fun(int a, int b){
        System.out.println(" Adding 2 integer number "+(a+b));
    }
    
    static void fun(double a, double b){
        System.out.println("Adding 2 double "+(a+b));
    }
    static void fun(float a,float b){
        System.out.println(" multiplying 2 float "+(a*b));
    }
    
    
    static void fun(String a,String b){
        System.out.println("concate 2 string "+(a+b));
    }
    
    static void funM(int a,int b){
        
        System.out.println("multiplying 2 int "+(a*b));
    }
    
    static void funC(String a,String b,String c){
        System.out.println("concate 3 string "+(a+b+c));
    }
    
    public static void main(String[] args) {
        System.out.println("Q10.Write a single program for following operation using overloading");
        Question_10.fun(1,2);
        Question_10.fun(1.0,2.0);
        Question_10.fun(1f,2f);
        Question_10.funM(1,2);
        Question_10.fun("hi","hello");
        Question_10.funC("hi ","hi ","hi ");
    }
}
