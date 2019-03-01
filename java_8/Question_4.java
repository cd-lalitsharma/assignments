@FunctionalInterface
interface EmployeeInterface{
    Employee setEmployee(String name, String city, int age);
}
class Employee{
    String name;
     String city;
     int age;
    
    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
}
public class Question_4 {
    
    public static void main(String[] args) {
        //Create an Employee Class with instance variables (String) name,
        // (Integer)age, (String)city and get the instance of the Class using constructor reference
        EmployeeInterface ei = Employee::new;
        Employee emp= ei.setEmployee("david","new york",25);
    
        System.out.println("Employee name , city and age is "+emp.name + " "+ emp.city+ " "+emp.age);
        
    }
}
