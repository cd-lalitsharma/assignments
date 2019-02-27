import java.util.Arrays;
import java.util.Comparator;

class student{
    private String name;
    private int score;
    private int age;
    student(String name,int score,int age){
        this.name=name;
        this.score=score;
        this.age=age;
    }
    
    public static Comparator<student> scoreComparator = new Comparator<student>() {
        @Override
        public int compare(student o1, student o2) {
            if (o2.score-o1.score==0){
                return o2.name.compareTo(o1.name);
                
            }else {
                return o2.score-o1.score;
            }
        }
    };
    
    public String toString(){
        return "{ "+this.name+" score "+this.score+" age "+this.age+" }";
    }
    
}
public class Question_5 {
    
    public static void main(String[] args) {
        System.out.println("Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age");
        
        student s[] = new student[6];
        
        s[0]= new student("abc",132,20);
        s[1]= new student("bdc",132,29);
        s[2]= new student("asd",1324,23);
        s[3]= new student("abcads",132000,27);
        s[4]= new student("asdc",1320,25);
        s[5]= new student("wewq",13200,22);
    
        Arrays.sort(s,student.scoreComparator);
        System.out.println(Arrays.toString(s));
    
    }
}
