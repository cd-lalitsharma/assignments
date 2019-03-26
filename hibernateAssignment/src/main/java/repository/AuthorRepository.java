package repository;

import HibernateUtil.Hibernate;
import model.*;
import org.hibernate.Session;
import service.AuthorService;

import java.util.*;
import java.util.stream.IntStream;

public class AuthorRepository {
    
    private static final Session session = Hibernate.getSession();
    
    
    public static void doUpdate(){
    
        System.out.println("Performing Insert");
        
        Author author = session.get(Author.class,1);
 
        author.setFirstName("new updated name");
        
        session.beginTransaction();
        session.update(author);
        session.getTransaction().commit();
        
        
    }
    
    public static void doInsert(){
    
    
        System.out.println("performing update");
        
        Author author = new Author();
        author.setId(1);
        author.setAge(22);
        author.setFirstName("test");
        author.setLastName("name");
        author.setDob(new Date());
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
    }
    
    public static void doRead() {
        System.out.println("Performing read from database");
        Author author = session.get(Author.class,1);
        System.out.println(author);
    }
    
    public static void doDelete() {
    
        System.out.println("deleting Author record with id 1");
        
        Author author = session.get(Author.class,1);
        
        session.beginTransaction();
        session.delete(author);
        session.getTransaction().commit();
    
        System.out.println("deleted successfully");
    }
    
    public static void doFillUsers() {
    
        List<Author> authorList = new ArrayList<>();
        
        IntStream.rangeClosed(2,10).forEach(i->{
        
            int id=i;
            
            int age=new Random().nextInt(100)+1;
            
            String firstname="Author"+i;
            String lastname="lastname "+i;
            Date d = new Date();
            
            authorList.add(new Author(id,firstname,lastname,age,d));
        });
        
        session.beginTransaction();
        authorList.forEach(e->session.save(e));
        session.getTransaction().commit();
        
    
    }
    
    public static void doAddAddressOfAuthor() {
        
        List<Author> authorList = new ArrayList<>();
        
        IntStream.rangeClosed(2,3).forEach(i->{
            
            int id=i;
            
            int age=new Random().nextInt(100)+1;
            
            String firstname="Author"+i;
            String lastname="lastname "+i;
            Date d = new Date();
            
            Integer streetNumber =i;
            String location="location"+i;
            String state ="state"+i;
            authorList.add(new Author(id,firstname,lastname,age,d, new Address(streetNumber,location,state)));
        });
        
        session.beginTransaction();
        authorList.forEach(e->session.save(e));
        session.getTransaction().commit();
        
        
    }
    
    public static void doPersistSubjectList() {
    
        List<Author> authorList = new ArrayList<>();
    
        IntStream.rangeClosed(2,10).forEach(i->{
        
            int id=i;
        
            int age=new Random().nextInt(100)+1;
        
            String firstname="Author"+i;
            String lastname="lastname "+i;
            Date d = new Date();
        
            Integer streetNumber =i;
            String location="location"+i;
            String state ="state"+i;
            List<String> subject = new ArrayList<>();
            subject.add("physics");
            
            authorList.add(new Author(id,firstname,lastname,age,d, new Address(streetNumber,location,state),subject));
        });
    
        session.beginTransaction();
        authorList.forEach(e->session.save(e));
        session.getTransaction().commit();
    
    }
    
    public static void doOneToOneMapping() {
    
        List<Author> authorList = new ArrayList<>();
    
        IntStream.rangeClosed(2,10).forEach(i->{
        
            int id=i;
        
            int age=new Random().nextInt(100)+1;
        
            String firstname="Author"+i;
            String lastname="lastname "+i;
            Date d = new Date();
        
            Integer streetNumber =i;
            String location="location"+i;
            String state ="state"+i;
            List<String> subject = new ArrayList<>();
            subject.add("physics");
            String bookName="book"+i;
        
            authorList.add(new Author(id,firstname,lastname,age,d,
                    new Address(streetNumber,location,state),
                    subject,
                    new Book(i,bookName)
                    ));
            
        });
    
        session.beginTransaction();
       authorList.forEach(e->session.save(e));
        session.getTransaction().commit();
    }
    
    public static void doOneToManyMapping() {
        
        List<Author> authorList = new ArrayList<>();
        
        IntStream.rangeClosed(2,3).forEach(i->{
            
            int id=i;
            
            int age=new Random().nextInt(100)+1;
    
    
            List<Book> bookList = new ArrayList<>();
            
            String firstname="Author"+i;
            String lastname="lastname "+i;
            Date d = new Date();
            
            Integer streetNumber =i;
            String location="location"+i;
            String state ="state"+i;
            List<String> subject = new ArrayList<>();
            subject.add("physics");
            String bookname="book"+i;
            
            bookList.add(new Book(i,bookname));
            bookList.add(new Book(i+1,bookname));
            bookList.add(new Book(i+2,bookname));
            bookList.add(new Book(i+3,bookname));
            
            authorList.add(new Author(firstname,lastname,age,d,
                    new Address(streetNumber,location,state),
                    subject,
                    bookList
            ));
            
        });
        
        session.beginTransaction();
        authorList.forEach(e->session.save(e));
        session.getTransaction().commit();
    }
    
    public static void doOneToManyBiDirectionalMapping() {
    
        List<Author> authorList = new ArrayList<>();
    
        IntStream.rangeClosed(2,3).forEach(i->{
        
            int id=i;
        
            int age=new Random().nextInt(100)+1;
        
        
            List<BookBDM> bookBDMList = new ArrayList<>();
        
            String firstname="Author"+i;
            String lastname="lastname "+i;
            Date d = new Date();
        
            Integer streetNumber =i;
            String location="location"+i;
            String state ="state"+i;
            List<String> subject = new ArrayList<>();
            subject.add("physics");
            String bookname="book"+i;
    
            bookBDMList.add(new BookBDM(i,bookname,new Author(id,firstname,lastname,age,d,
                    new Address(streetNumber,location,state))));
            bookBDMList.add(new BookBDM(i+1,bookname,new Author(id,firstname,lastname,age,d,
                    new Address(streetNumber,location,state))));
        
            authorList.add(new Author(i,firstname,lastname,age,d,
                    new Address(streetNumber,location,state),
                    subject,
                    bookBDMList
            ));
        
        });
    
        session.beginTransaction();
        authorList.forEach(e->session.save(e));
        session.getTransaction().commit();
        
    }
    
    public static void doManyToManyMapping() {
    
        List<Author> authorList = new ArrayList<>();
    
        IntStream.rangeClosed(900,902).forEach(i->{
        
            int id=i;
        
            int age=new Random().nextInt(100)+1;
        
        
            List<BookMDM> bookMDMList = new ArrayList<>();
        
            String firstname="Author"+i;
            String lastname="lastname "+i;
            Date d = new Date();
        
            Integer streetNumber =i;
            String location="location"+i;
            String state ="state"+i;
            
            List<String> subject = new ArrayList<>();
            subject.add("physics");
            
            String bookname="book"+i;
    
            bookMDMList.add(new BookMDM(
                    id,
                    bookname,
                    Arrays.asList(new Author(id,firstname,lastname,age,d,
                                  new Address(streetNumber,location,state))
                    )
                  )
            );
        
            authorList.add(new Author(id,firstname,lastname,age,d,
                    new Address(streetNumber,location,state),
                    subject,
                    bookMDMList
            ));
        
        });
    
        session.beginTransaction();
        authorList.forEach(e->session.save(e));
        session.getTransaction().commit();
    
    }
    
    public static void close() {
        session.close();
    }
}
