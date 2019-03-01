import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question_9 {
    
    public static void main(String[] args) {
        //Collect all the even numbers from an integer list.
        IntStream i = IntStream.rangeClosed(1,100);
     
        
        List<Integer> returnedList=i.filter(e -> e%2==0).boxed().collect(Collectors.toList());
        returnedList.forEach(System.out::println);
    }
}
