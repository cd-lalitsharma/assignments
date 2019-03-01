import java.util.stream.IntStream;

public class Question_11 {
    
    public static void main(String[] args) {
        //Find average of the number inside integer list after doubling it.
    
        IntStream intStream = IntStream.rangeClosed(1,100);
    
        System.out.println("Average is "+ (intStream.map(e->e*2).average().getAsDouble()));
    }
}
