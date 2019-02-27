import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question_8 {
    
    public static void main(String[] args) throws ParseException {
        System.out.println("Q. Write a program to format date as example \"21-March-2016\"");
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MMMM-yyyy");
        String dateString = dateFormat.format(new Date());
        System.out.println(dateString);
        
        
    }

}
