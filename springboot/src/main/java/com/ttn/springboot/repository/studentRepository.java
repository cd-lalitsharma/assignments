package com.ttn.springboot.repository;

import com.ttn.springboot.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends CrudRepository<StudentModel,Integer> {
}
