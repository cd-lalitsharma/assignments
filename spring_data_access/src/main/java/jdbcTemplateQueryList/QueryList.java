package jdbcTemplateQueryList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class QueryList {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    
    public void queryList(){
    
        String sql="select * from user";
        
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
    
        for (Map<String,Object> map:
             list) {
            for (Map.Entry<String,Object> m:
                 map.entrySet()) {
                System.out.print(" "+m.getKey() + "  "+m.getValue());
            }
            System.out.println();
        }
    }
}
