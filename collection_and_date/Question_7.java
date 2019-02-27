import java.lang.reflect.Array;
import java.util.*;
class specialStack{
    static ArrayDeque<Integer> specialStack =new ArrayDeque<>(5);
    static  int min;
    public static void push(int element){
        specialStack.addLast(element);
        if (min==0){
            min=element;
        }else if (min>element){
            min=element;
        }
    }
    public static void pop(){
        specialStack.removeLast();
    }
    
    public static boolean isFull(){
        if(specialStack.size()==5){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isEmpty(){
        return specialStack.isEmpty();
    }
    
    public static void getElements(){
    
        Iterator<Integer> iterator = specialStack.iterator();
    
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

public class Question_7 {
  
    public static void main(String[] args) {
        System.out.println("Q. Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity  O(1))");
    
        //pushing in stack
       specialStack.push(1);
       specialStack.push(2);
       specialStack.push(3);
       specialStack.push(4);
       specialStack.push(5);
       
    
        System.out.println("Stack after push operation is ");
       specialStack.getElements();
       
       // popping from stack
        specialStack.pop();
        specialStack.pop();
    
        System.out.println("Stack after pop operation is ");
        specialStack.getElements();
        
        // checking if stack is full
        System.out.println("stack is full "+specialStack.isFull());
        
        //checkign if stack is empty
        System.out.println("Stack is empty "+specialStack.isEmpty());
        
        //getting min element
        System.out.println("the min element is "+specialStack.min);
        
        
    
    
    }
}
