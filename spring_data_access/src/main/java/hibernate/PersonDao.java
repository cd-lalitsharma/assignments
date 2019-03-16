package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class PersonDao {


    @Autowired
    SessionFactory sessionFactory;
    
    public void getUser(){
        String sql ="select count(*) from User";
        
        Query query = sessionFactory.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }
}
