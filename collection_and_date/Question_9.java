import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question_9 {
    public static void main(String[] args) {
        System.out.println("Q. Write a program to display times in different country format.");
        Date d = new Date();
        System.out.println("Today's date is "+d.toString());
        Locale german = Locale.GERMANY;
    
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,german);
        System.out.println("Date in german locale is "+df.format(d));
        
    }

}
