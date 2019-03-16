package transaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TransactionRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void reuiredTransaction(){
        String sql ="insert into user values (?,?,?,?,?,?)";
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"trnasaction_username","t_name","tpass",24,"1995-4-15"
        }));
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void reuiredNewTransaction(){
        String sql ="insert into user values (?,?,?,?,?,?)";
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"trnasaction_username","t_name","tpass",24,"1995-4-15"
        }));
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void mandatoryTransaction(){
        
        this.mandatory();
    }
    
    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatory(){
        String sql ="insert into user values (?,?,?,?,?,?)";
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"mandatory_username","t_name","tpass",24,"1995-4-15"
        }));
    }
    
    @Transactional(propagation = Propagation.NESTED)
    public void nestedTransaction(){
        String sql ="insert into user values (?,?,?,?,?,?)";
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"trnasaction_username","t_name","tpass",24,"1995-4-15"
        }));
    }
    
    @Transactional(propagation = Propagation.NEVER)
    public void neverTransaction(){
        String sql ="insert into user values (?,?,?,?,?,?)";
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"trnasaction_username","t_name","tpass",24,"1995-4-15"
        }));
    }
    
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedTransaction(){
        String sql ="insert into user values (?,?,?,?,?,?)";
        System.out.println(jdbcTemplate.update(sql,new Object[]{
                0,"trnasaction_username","t_name","tpass",24,"1995-4-15"
        }));
    }
    

}
