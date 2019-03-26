package com.ttn.springDataJpa;

import com.ttn.springDataJpa.entity.Person;
import com.ttn.springDataJpa.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        /*getting application context*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(com.ttn.springDataJpa.config.Persistantcontext.class);
    
        PersonRepository personRepositroy = applicationContext.getBean(PersonRepository.class);
        
        
        Person person = new Person();
        person.setFirstName("fname");
        person.setLastName("lname");
        person.setAge(25);
        person.setSalary(242341);
        
        personRepositroy.save(person);
    
        Person person1 = new Person();
        person1.setFirstName("peter");
        person1.setLastName("plname");
        person1.setAge(26);
        person1.setSalary(24234);
     
        personRepositroy.save(person1);
        
/*        personRepositroy.findAll().forEach(i->{
            System.out.println("Person is"+i.getFirstName() + " "+ i.getLastName());
        });*/

        
        //find by first name
        System.out.println(personRepositroy.findByFirstName("fname").getLastName());
        
        //find by Last name
        System.out.println(personRepositroy.findByLastName("lname").getFirstName());
        
        //find by Id
        System.out.println(personRepositroy.findById(1).getLastName());
        
        //Use @Query to fetch firstname of the Person whose age is 25.
    
        System.out.println(personRepositroy.findFirstNameOfAge25());
        
        //Use @Query to fetch firstname and lastname of the Person whose age is 25.
        List<Object[]> list = personRepositroy.findFirstAndLastNameOfAge25();
        Iterator itr= list.iterator();
        
        while (itr.hasNext()){
            Object[] strings = (Object[]) itr.next();
            System.out.println(strings[0]+"  "+strings[1]);
        }
        
        //Get complete information of the Employee whose age is 25 using @Query.
        System.out.println("complete info of person of age 25");
        System.out.println(personRepositroy.findPersonOfAge25());
        
        //Count Person where name is "Peter" using @Query.
        System.out.println("count is "+personRepositroy.countOfPersonWithNamePeter("peter"));
    
        // count total person
        System.out.println("total person are "+ personRepositroy.countTotalPerson());
        
        //distinct age
        System.out.println(personRepositroy.findDistinctByAge(25).getFirstName());
        
//        or example
        System.out.println(personRepositroy.findByIdOrAge(1,26));


        //and example
        System.out.println(personRepositroy.findByIdAndAgeAndFirstName(1,25,"fname"));
        
        //between
        System.out.println(personRepositroy.findByAgeBetween(24,28));
        
        //less than
        System.out.println(personRepositroy.findByIdLessThan(5));
        
        //greater than
        System.out.println(personRepositroy.findByIdGreaterThan(1));
        
        //like
        System.out.println(personRepositroy.findByFirstNameLike("nm"));
        
        //not
        System.out.println(personRepositroy.findByFirstNameNot("fname"));
        
        //in
        System.out.println(personRepositroy.findByAgeIn(Arrays.asList(1,25)));
   
        //ignore case
//        System.out.println(personRepositroy.findByNameIgnoreCase("FName"));
    
        System.out.println(personRepositroy.findByAgeGreaterThanOrderByIdDesc(25));
    
       
        //Do  the question above using the Sort class.
        System.out.println(personRepositroy.findByAgeGreaterThan(25,new Sort(Sort.Direction.DESC,"id")));
        
        //Apply Pagination on Person entities.
    
        Page<Person> personPage = personRepositroy.findAll(new PageRequest(0,2,new Sort(Sort.Direction.DESC,"id")));
        List<Person> pagePersonList = personPage.getContent();
        
        System.out.println("paged results "+pagePersonList);
        
        
        
    
        
        
        
        
        
        
        
        
        
    }
}
