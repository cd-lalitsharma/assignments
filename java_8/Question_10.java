import java.util.stream.IntStream;

public class Question_10 {
    public static void main(String[] args) {
        //Sum all the numbers greater than 5 in the integer list.
    
        IntStream intStream = IntStream.rangeClosed(1,100);
        System.out.println("sum is "+ (intStream.filter(e->e>5).sum()));
    }
}
