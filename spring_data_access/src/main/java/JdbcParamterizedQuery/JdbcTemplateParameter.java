package JdbcParamterizedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTemplateParameter {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    protected void perameterizedQuery(){
        
        String sql = "select name from user where username=?";
        System.out.println("name is "+jdbcTemplate.queryForObject(sql,new Object[]{"test"},String.class));
    }
}
