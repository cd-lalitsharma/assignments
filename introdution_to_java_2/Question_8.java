import java.util.Scanner;

public class Question_8 {
    
    public static void main(String[] args) {
        System.out.println("Q. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. ");
        System.out.println("For the required loop, use a \n" +
                "a)while statement \n" +
                "b)do-while statement");
        System.out.println("Start Typing");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        while(!word.equals("done")){
            if(word.charAt(0) == word.charAt(word.length()-1)){
                System.out.println(" First Character matches the Last Character");
            }else{
                System.out.println(" First Character does not match with Last Character");
            }
            word = s.nextLine();
        }

//        do{
//            if(word.charAt(0) == word.charAt(word.length()-1)){
//                System.out.println("First Character matches the Last Character");
//            }else{
//                System.out.println("First Character does not match with Last Character");
//            }
//            word = s.nextLine();
//
//        }while (!word.equals("done"));
    }
}
