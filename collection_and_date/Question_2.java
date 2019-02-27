import java.util.*;

public class Question_2 {
    
    
    public  static int unique(String string){
        
        char[] charArray = string.toCharArray();
        List<Character> list= new ArrayList<>();
        for (char a:charArray
             ) {
            list.add(a);
        }
        Set<Character> uniqueValue = new HashSet<>(list);
        System.out.println(uniqueValue);
        return  uniqueValue.size();
    }
    
    public static void main(String[] args) {
        System.out.println("Q. Write a method that takes a string and returns the number of unique characters in the string.\n");
    
        int size=0;
        size=Question_2.unique("This is a string");
        System.out.println("The number of unique elements are "+size);
    
    }
}
