package jdbcRowMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class RowMapperClass {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    User getUser(){
        String sql ="select * from user where name=?";
        return  jdbcTemplate.queryForObject(sql,new Object[]{"adam"},new UserRowMapper());
    }
}
