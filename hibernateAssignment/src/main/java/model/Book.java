package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    Integer id;
    
    String bookName;
    
    public Book(Integer id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }
}
