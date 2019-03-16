package JdbcTemplateInsert;

import JdbcParamterizedQuery.JdbcTemplateParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTemplateInsert {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public int insertRecord(User user){
        String sql = "insert into user values (?,?,?,?,?,?)";
        int result=0;
        java.sql.Date date = new java.sql.Date(user.getDob().getTime());
        result=jdbcTemplate.update(sql,new Object[]{user.getId(),
        user.getUsername(),user.getPassword(),user.getName(),user.getAge(),date
        });
        
        return result;
        
    }
    
}
