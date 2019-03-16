package JdbcTemplateInsert;

import java.util.Date;

public class User {
    Integer id;
    String name;
    String username;
    String password;
    Integer age;
    Date dob;
    
    public User(Integer id, String name, String username, String password, Integer age, Date dob) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        this.dob = dob;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public Date getDob() {
        return dob;
    }
}
