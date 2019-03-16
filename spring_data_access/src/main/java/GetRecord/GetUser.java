package GetRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class GetUser {

    @Autowired
    DataSource dataSource;
    
    public void userName() throws SQLException {
    
        Connection connection = dataSource.getConnection();
    
        PreparedStatement preparedStatement = connection.prepareStatement("select name, username from user where  name=?");
        preparedStatement.setString(1,"bob");
        ResultSet resultSet=preparedStatement.executeQuery();
        
        while (resultSet.next()){
            System.out.println("user "+resultSet.getString("name")+ " has username " + resultSet.getString("username"));
        }
    
    }

}
