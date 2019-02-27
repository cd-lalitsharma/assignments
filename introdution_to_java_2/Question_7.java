import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Question_7 {
    
    public static void main(String[] args) {
        System.out.println("Q. WAP to convert seconds into days, hours, minutes and seconds.");
    
        Scanner s = new Scanner(System.in);
        int sec = s.nextInt();
    
        int day = (int) TimeUnit.SECONDS.toDays(sec);
        int hours = (int)TimeUnit.SECONDS.toHours(sec) - (day*24);
        int minute = (int)(TimeUnit.SECONDS.toMinutes(sec) - TimeUnit.SECONDS.toHours(sec)* 60);
        int secs = (int)(TimeUnit.SECONDS.toSeconds(sec)- TimeUnit.SECONDS.toMinutes(sec)*60);
    
        System.out.println("days: "+ day + " hours: "+ hours + " minute: "+ minute + " sec: "+ secs);
    }
}
