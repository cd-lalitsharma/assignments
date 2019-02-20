public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Q3. Write a program to find the number of occurrences of a character in a string without using loop?");
        String str= "hello world";
        String newStr = str.replace("l","");
        int occurrences = str.length()-newStr.length();
        System.out.println("l occurred "+occurrences+" number of times");
        
        
    }
}
