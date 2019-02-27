import java.io.StringReader;
import java.util.Arrays;
import java.util.Comparator;

class Employee{
    
    private String name=null;
    private int salary= 0;
    
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    
    public  static Comparator<Employee> SalaryComparator= new Comparator<Employee>(){
    
        @Override
        public int compare(Employee e1,Employee e2) {
            return e2.salary-e1.salary;
        }
    };
    
    
    public String toString(){
        return  this.name + " "+ this.salary;
    }
}
public class Question_4 {
    public static void main(String[] args) {
        System.out.println("Q. Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name");
        Employee[] e = new Employee[5];
        e[0]=new Employee("abc",123);
        e[1]=new Employee("asd",1230);
        e[2]=new Employee("wew",12300);
        e[3]=new Employee("aqwe",1230000);
        e[4]=new Employee("ioas",12300000);
        Arrays.sort(e,Employee.SalaryComparator);
        System.out.println(Arrays.toString(e));
    }
}
