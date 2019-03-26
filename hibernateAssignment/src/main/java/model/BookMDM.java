package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookMDM {
    @Id
    Integer id;
    
    String bookName;
    
    @ManyToMany(mappedBy = "bookMDMList")
    List<Author> author= new ArrayList<>();
    
    
    public BookMDM(Integer id, String bookName,List<Author> author) {
        this.id = id;
        this.bookName = bookName;
        this.author=author;
    }
}
