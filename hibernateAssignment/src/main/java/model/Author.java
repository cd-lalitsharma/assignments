package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.TABLE)
    Integer id;
    
    @Column(name = "First_Name")
    String firstName;
    @Column(name = "Last_Name")
    @Transient
    String lastName;
    @Column(name = "Age")
    Integer age;
    
    @Temporal(TemporalType.DATE)
    Date dob;
    
    
    @Embedded
    Address address;
    
    @ElementCollection
    List<String> listOfSubjects = new ArrayList<>();
    
    @OneToOne(cascade=CascadeType.ALL)
    Book book;

    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name="author_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    List<Book> bookList = new ArrayList<>();

    @OneToMany(mappedBy = "author")
    List<BookBDM> bookBDMList = new ArrayList<>();
    
    @ManyToMany
    List<BookMDM> bookMDMList = new ArrayList<>();
    

    //many to many
    public Author(Integer id, String firstName, String lastName, Integer age, Date dob, Address address, List<String> listOfSubjects, List<BookMDM> bookMDMList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.listOfSubjects = listOfSubjects;
        this.bookMDMList = bookMDMList;
    }
    
    //bidirectional mapping
   public Author(int id,String firstName, String lastName, Integer age, Date dob, Address address, List<String> listOfSubjects, List<BookBDM> bookBDMList) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.listOfSubjects = listOfSubjects;
        this.bookBDMList = bookBDMList;
    }
    //one to many
    public Author( String firstName, String lastName, Integer age, Date dob, Address address, List<String> listOfSubjects, List<Book> bookList) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.listOfSubjects = listOfSubjects;
        this.bookList = bookList;
    }
    
    public Date getDob() {
        return dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
    public Author(){
    
    }
    
    
    //one to one mapping
    public Author(int id,String firstName, String lastName, Integer age, Date dob, Address address, List<String> listOfSubjects, Book book) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.listOfSubjects = listOfSubjects;
        this.book = book;
    }
    // embeddable collection
    public Author(Integer id, String firstName, String lastName, Integer age, Date dob, Address address, List<String> listOfSubjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.listOfSubjects = listOfSubjects;
    }
    // add dob
    public Author(Integer id, String firstName, String lastName, Integer age, Date dob) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
    }
    
    //add address
    public Author(Integer id, String firstName, String lastName, Integer age, Date dob, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.address=address;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Author details are {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
    
    
}
