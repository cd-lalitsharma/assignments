package jdbcQueryForMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class QueryMap {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void queryMap(){
        String sql = "select name from user where username=?";
        Map m=jdbcTemplate.queryForMap(sql,new Object[]{"test"});
        m.forEach((k,v)-> System.out.println(k+" is "+v));
    }
}
