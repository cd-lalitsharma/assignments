class CustomException extends Exception{
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}
public class Question_13 {
    public static void main(String[] args) {
        System.out.println("Q. Create a custom exception that do not have any stack trace.");
        try{
            throw new CustomException();
        }catch (CustomException e){
            e.printStackTrace();
        }
    
    }
}
