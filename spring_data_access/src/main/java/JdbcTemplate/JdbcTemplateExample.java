package JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Repository
public class JdbcTemplateExample {
    
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void getUserCount(){
        String sql = "select count(*) from user";
    
        //System.out.println(jdbc);
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
        
    }
    
}
