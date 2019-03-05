import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Employee{
 
    void department();
    
}

class Hr implements Employee{
    String name=null;
    String age=null;
    
    public Hr(String name, String age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public void department() {
        System.out.println("Hr Department");
        
    }
}



class Dev implements Employee{
    String name=null;
    String age=null;
    
    public Dev(String name, String age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public void department() {
        System.out.println("Dev Department");
        
    }
}

class Departments{
    List<Employee> employees=new ArrayList<>();
    Iterator iterator=employees.iterator();
    
    void add(Employee employee){
    employees.add(employee);
    }
    
    void show(){
    employees.forEach(i->i.department());
    }
    
    
}
public class Question_7 {
    
    public static void main(String[] args) {
        //Implement Composite Design Pattern to maintain the directories of employees on the basis of departments.
        Departments departments=new Departments();
        departments.add(new Hr("abc","45"));
        departments.add(new Hr("adc","45"));
        new Hr("adc","45").department();
        departments.show();
    
    
    
    
    }
}
