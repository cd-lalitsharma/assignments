package service;

import HibernateUtil.Hibernate;
import org.hibernate.Session;
import repository.AuthorRepository;

public class AuthorService {
    
    public static void doInsert(){
        AuthorRepository.doInsert();
    }
    public static void doCrud(){
        
        //create
//        AuthorRepository.doInsert();
        
        //read
        AuthorRepository.doRead();
    
        //update
        AuthorRepository.doUpdate();
    
        //delete
        AuthorRepository.doDelete();
    }
    
    
    public static void doInsertForDate() {
        
//        AuthorRepository.doInsert();
    }
    
    public static void insertMoreUsers() {
        
        AuthorRepository.doFillUsers();
    }
    
    public static void AddAuthorAddress() {
        AuthorRepository.doAddAddressOfAuthor();
    }
    
    public static void PersistSubjectList() {
        AuthorRepository.doPersistSubjectList();
    }
    
    
    public static void closeSession(){
        AuthorRepository.close();
    }
    
    public static void oneToOneMapping() {
    
        AuthorRepository.doOneToOneMapping();
    }
    public static void oneToManyMapping() {
    
        AuthorRepository.doOneToManyMapping();
    }
    
    public static void oneToManyBiDirectionalMapping() {
        AuthorRepository.doOneToManyBiDirectionalMapping();
    
    }
    
    public static void manyToManyMapping() {
        AuthorRepository.doManyToManyMapping();
    }
}
