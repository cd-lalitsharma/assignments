package jdbcRowMapper;


import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        /*
           ganda kaam nai karna
        user.setId(0);
        user.setAge(26);
        user.setName("mapper user");
        user.setUsername("mapper username");
        user.setPassword("mapperPass");
        user.setDob(new Date());*/
        
        user.setId(rs.getInt("user_id"));
        user.setAge(rs.getInt("age"));
        user.setName(rs.getString("name"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setDob(rs.getDate("dob"));
        
        return user;
    }
}
