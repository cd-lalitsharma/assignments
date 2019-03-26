package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookBDM {
    @Id
    Integer id;
    
    String bookName;
    
    @ManyToOne
    Author author;
    
    
    public BookBDM(Integer id, String bookName,Author author) {
        this.id = id;
        this.bookName = bookName;
        this.author=author;
    }
}
