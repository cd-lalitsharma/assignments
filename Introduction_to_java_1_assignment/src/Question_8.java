public class Question_8 {
    public static void main(String[] args) {
        System.out.println("Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer");
        StringBuffer str = new StringBuffer("This is the String");
        
        str.reverse().delete(4,9);
        System.out.println(str);
    }
}
