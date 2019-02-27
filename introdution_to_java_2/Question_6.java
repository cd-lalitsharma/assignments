public class Question_6 {
    
    public static void main(String[] args) {
        System.out.println("Q. WAP showing try, multi-catch and finally blocks.");
    
        int a;
        try{
            a=1/0;
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception occurred");
        }catch (Exception e){
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("It will execute 100%");
        }
    }
}
