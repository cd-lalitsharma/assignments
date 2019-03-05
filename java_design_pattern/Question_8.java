interface Students{
    void records();
}

class Records implements Students{
    
    @Override
    public void records() {
        System.out.println("Record fetched by admin");
    }
}

class RecordsProxy implements Students{
    
    private boolean isAdmin;
    private Records records;
    RecordsProxy(String username, String pass){
        if ("admin".equalsIgnoreCase(username) && "pass".equalsIgnoreCase(pass)){
            isAdmin=true;
        }else {
            isAdmin=false;
        }
    }
    
    @Override
    public void records() {
        if (isAdmin){
        records= new Records();
        records.records();
        
        }else {
            System.out.println("You cannot access records because you are not Admin");
        }
    }
}

public class Question_8 {
    public static void main(String[] args) throws Exception{
        //Implement proxy design for accessing Record of a student and allow the access only to Admin.
    
//        System.out.println(Runtime.getRuntime().exec("ls"));
    
        RecordsProxy p ;
        p= new RecordsProxy("testUsername","testPass");
        p.records();
    
        p= new RecordsProxy("admin","pass");
        p.records();
    
       
    
    
    }
    
}
