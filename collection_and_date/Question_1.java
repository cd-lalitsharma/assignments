import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question_1 {
    
    
    public static void main(String[] args) {
        System.out.println("Q. Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.");
    
        List<Float> list = new ArrayList<Float>();
        float count=0;
        list.add(1F);
        list.add(2F);
        list.add(3F);
        list.add(4F);
        list.add(5F);
        ListIterator<Float> iterator = list.listIterator();
        while (iterator.hasNext()){
            count+=iterator.next();
        }
    
        System.out.println("The count is "+count);
        
   
    }
}
