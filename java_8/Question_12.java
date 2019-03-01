import java.util.stream.IntStream;

public class Question_12 {
    
    public static void main(String[] args) {
        //Find the first even number in the integer list which is greater than 3.
    
        IntStream i = IntStream.rangeClosed(1,100);
        System.out.println("first even number is "+ i.filter(e ->e>3).findFirst().getAsInt());
    }
}
