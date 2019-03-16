package transactionLimit;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Date;

@Repository
public class TransactionLimit {

    @Autowired
    SessionFactory sessionFactory;
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    
    @Transactional(readOnly = true)
    public void readOnly(){
        
        User user = new User();
        user.setAge(24);
        user.setDob(new Date());
        user.setId(0);
        user.setName("hibernate");
        user.setPassword("pass");
        user.setUsername("hibernateuser");
    /*
        Query query=sessionFactory.openSession().createQuery("select count(*) from User");
        System.out.println(query.uniqueResult());*/
    
        String sql ="insert into user values (?,?,?,?,?,?)";
    
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"tx_username","t_name","tpass",24,"1995-4-15"
        }));
    }
    
    
    @Transactional(timeout = 2)
    public void timeOutTransaction(){
        String sql = "select username from user where name=?";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(jdbcTemplate.queryForObject(sql,new Object[]{"adam"},String.class));
 
    }
    
    @Transactional(rollbackFor = {IOException.class})
    public void rollBackForIo() throws IOException{
    
        String sql ="insert into user values (?,?,?,?,?,?)";
    
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"tx_rb_username","t_name","tpass",24,"1995-4-15"
        }));
        System.out.println("record inserted but rolling back now");
        throw new IOException();
    }
    
    @Transactional(noRollbackFor = RuntimeException.class)
    public void noRollBackForRuntime() {
    
        String sql ="insert into user values (?,?,?,?,?,?)";
    
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"tx_rbf_username","t_name","tpass",24,"1995-4-15"
        }));
        System.out.println("record inserted but not rolling back");
        throw new RuntimeException();
    
    }
}
