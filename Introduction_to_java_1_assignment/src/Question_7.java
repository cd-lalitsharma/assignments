public class Question_7 {
    public static String FirstName="Lalit";
    public static String LastName="Sharma";
    public static int age=22;
    static {
    
        System.out.println("Question. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively");
        System.out.println("======static block execution start======");
        System.out.println(FirstName + " "+ LastName+" age "+age);
        System.out.println("======static block execution finished======\n");
    }
    
    public static void staticMethod(){
        System.out.println(FirstName + " "+ LastName+" age "+age);
    }
    public static void main(String[] args) {
        System.out.println("======static method execution start======");
        Question_7.staticMethod();
        System.out.println("======static method execution finished======\n");
    
        System.out.println("======static Variable execution start======");
        System.out.println(Question_7.FirstName + " " +Question_7.LastName+ " age "+age);
        System.out.println("======static Variable execution finished======\n");
        
    }
}
