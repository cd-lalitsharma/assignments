import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question_5 {
    
    public static void main(String[] args) {
        /*Implement following functional interfaces from java.util.function using lambdas:
        
        (1) Consumer
        
        (2) Supplier
        
        (3) Predicate
        
        (4) Function*/
    
        // using consumer
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(2);
        
        //Supplier
        Supplier<Double> supplier= Math::random;
        System.out.println("Random number is "+supplier.get());
        
        //Predicate
        Predicate<Integer> predicate = (s)->s>10;
        System.out.println("Is 11 greater than 10 "+predicate.test(11));
    
        Function<Integer,Boolean> function = (a)-> a>10 ? true  :false;
    
        System.out.println("is greater than 10 " + function.apply(15));
        
    }
}
