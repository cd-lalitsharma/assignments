//class DefClass{
//
//}
public class Question_3 {
    public static void main(String[] args) {
        System.out.println("Q. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.");
    
        try {
            Class.forName("fake Class");
        
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
//        DefClass d = new DefClass();
    }
    
    }


