package com.ttn.springDataJpa.repository;

import com.ttn.springDataJpa.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    
    void delete(Person personToDelete);
    
    List<Person> findAll();
    
    Person save(Person personToSave);
    
    
    Person findByFirstName(String fname);
    
    Person findByLastName(String lname);
    
    Person findById(int id);
    
    @Query("select firstName from Person where age=25")
    String findFirstNameOfAge25();
    
    @Query("select firstName,lastName from Person where age=25")
    List<Object[]> findFirstAndLastNameOfAge25();
    
    @Query("select p from Person p where age=25")
    Person findPersonOfAge25();
    
    
    @Query("select count(p) from Person p where firstName=:fname")
    Integer countOfPersonWithNamePeter(@Param("fname") String name);
    
    
    @Query("select count(p) from Person p ")
    Integer countTotalPerson();
    
    
    Person findDistinctByAge(Integer age);
    
    List<Person> findByIdOrAge(Integer id, Integer age);
    
    List<Person> findByIdAndAgeAndFirstName(Integer id, Integer age, String fname);
    
    List<Person> findByAgeBetween(int min, int max);
    
    List<Person> findByIdLessThan(int lessThan);
    
    List<Person> findByIdGreaterThan(int greaterThan);
    
    List<Person> findByFirstNameLike(String likeName);
    
    List<Person> findByFirstNameNot(String nameNotLike);
    
    List<Person> findByAgeIn(List<Integer> ageList);

//    Person findByNameIgnoreCase(String name);
    
    
    List<Person> findByAgeGreaterThanOrderByIdDesc(int age);
    
    List<Person> findByAgeGreaterThan(int age,Sort sort);
    
    Page<Person> findAll(Pageable pageable);
    
}

