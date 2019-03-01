@FunctionalInterface
interface IsGreater{
    boolean isGreater(int x, int y);
}

@FunctionalInterface
interface Incrementor{
    int incerment(int a);
}

@FunctionalInterface
interface StringConcat{
    String concat(String a, String b);
}

@FunctionalInterface
interface Upper{
    String toUpper(String s);
}
public class Question_1 {
    
    public static void main(String[] args) {
    
        //(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
        
        IsGreater i = (a,b)->a>b;
        System.out.println("Is 5 greater then 4 "+i.isGreater(5,4));
    
        
        //(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
        Incrementor incrementor = (a)->a+1;
        System.out.println("Incremented value of 1 is "+incrementor.incerment(1));
        
        //(3) Concatination of 2 string      Parameter (String , String ) Return (String)
        StringConcat sc = (a,b)->a.concat(b);
        System.out.println("Concatinating hello and world "+sc.concat("hello","world"));
        
        //(4) Convert a string to uppercase and return .   Parameter (String) Return (String)
        Upper u = (String s)->s.toUpperCase();
        System.out.println("hello in upper case "+u.toUpper("hello"));
    }
}
