import java.util.HashMap;
import java.util.Map;

public class Question_3 {
    
    public static void main(String[] args) {
        
        System.out.println("Q.Write a method that takes a string and print the number of occurrence of each character characters in the string.");
        Occurence("This is the string");
    }
    
    private static void Occurence(String string) {
        HashMap<Character,Integer> charCount = new HashMap<>();
        char[] charArray = string.toCharArray();
        
        for (Character a:
             charArray) {
            if (charCount.containsKey(a)){
                charCount.put(a,charCount.get(a)+1);
            }else{
                charCount.put(a,1);
            }
        }
        
        for (Map.Entry entry:charCount.entrySet()){
            System.out.println(entry.getKey()+ " occured "+entry.getValue()+ " times");
        }
    }
    
}
