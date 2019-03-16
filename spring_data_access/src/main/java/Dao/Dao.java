package Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dao {

    
    DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    void printUsername() throws SQLException {
    
        Connection connection= dataSource.getConnection();
    
        PreparedStatement preparedStatement= connection.prepareStatement("select * from user");
    
        ResultSet resultSet=preparedStatement.executeQuery();
        
        while (resultSet.next()){
            System.out.println("username is "+resultSet.getString("name"));
        }
        
        
    }
    

}
