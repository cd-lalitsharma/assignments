public class Question_1 {
    
    /*Q1. Write a program to replace a substring inside a string with other string ?*/
    
    public static void main(String[] args) {
        String originalString ="Replace a with b";
        
        System.out.println("Original string is "+ originalString);
        
        //Using replace function to search and replace a string
        String replacedString= originalString.replace('a','b');
        
        System.out.println("After replace string is "+replacedString);
    }
}
