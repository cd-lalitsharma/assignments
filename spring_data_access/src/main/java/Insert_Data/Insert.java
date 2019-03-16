package Insert_Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@Service
public class Insert {
    
    @Autowired
    DataSource dataSource;
    
    public int doInsert(String userName, String password , String name, int age, Date dob) throws SQLException {
    
    
        Connection connection= dataSource.getConnection();
        PreparedStatement preparedStatement= connection.prepareStatement("insert into user values (?,?,?,?,?,?)");
        preparedStatement.setInt(1,0);
        preparedStatement.setString(2,userName);
        preparedStatement.setString(3,password);
        preparedStatement.setString(4,name);
        preparedStatement.setInt(5,age);
        preparedStatement.setDate(6, new java.sql.Date(dob.getTime()));
        int result =preparedStatement.executeUpdate();
        System.out.println(result);
        return  result;
    
    }
}
