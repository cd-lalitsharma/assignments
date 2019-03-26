package HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    private Hibernate(){}
    
    private static class InstanceCreater{
    
        private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        private final static Session session = sessionFactory.openSession();
        
    }
    
    public static Session getSession(){
    
        return InstanceCreater.session;
    }
}
