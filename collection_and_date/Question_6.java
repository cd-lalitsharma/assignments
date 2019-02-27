import java.lang.reflect.Array;
import java.util.*;

public class Question_6 {
    
    public static void main(String[] args) {
        System.out.println("Q.Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came firs");
    
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> arrayFrequency = new LinkedHashMap<>();
        List<Integer> frequency = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(100);
        list.add(210);
        list.add(180);
        list.add(180);
        list.add(180);
        list.add(180);
        list.add(180);
        list.add(140);
        list.add(1668);
        list.add(1668);
        list.add(1668);
        list.add(1668);
        list.add(1668);
        list.add(1450);
        
        
        for (int a:
             list) {
            
            if (arrayFrequency.containsKey(a)){
                arrayFrequency.put(a,arrayFrequency.get(a)+1);
            }else {
                arrayFrequency.put(a,1);
            }
    
        }
        System.out.println("Intergers with their frequency is");
        for (Map.Entry<Integer,Integer> map: arrayFrequency.entrySet()){
            System.out.println(map.getKey()+"   "+map.getValue());
        }
        System.out.println("\n");
        
        Map<Integer,Integer> m = sortFrequency(arrayFrequency);
        
        
        System.out.println("Sorted array in decreasing order is ");
    
        for (Map.Entry<Integer,Integer> map: m.entrySet()){
            System.out.println(map.getKey()+"   "+map.getValue());
        }
        
      
   
        
        
    }
    
    public static Map<Integer,Integer> sortFrequency(Map<Integer,Integer> map){
    
        List<Map.Entry<Integer,Integer>> list= new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return -(o1.getValue().compareTo(o2.getValue()));
            }
        });
        Map<Integer,Integer> result= new LinkedHashMap<>();
        for (Map.Entry<Integer,Integer> entry:list){
            result.put(entry.getKey(),entry.getValue());
        }
        return result;
    }
}
