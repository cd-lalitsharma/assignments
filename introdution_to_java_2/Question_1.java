abstract class Library{
    String lib_name;
    String lib_address;
    
    abstract void library_details();
    Library(){
        lib_name = "Library Name";
        lib_address="Noida";
    }
}

interface library_util{
    int seat_cap = 500;
    void issuebook();
    void returnbook();
}
public class Question_1 extends Library implements library_util {
    
    
    @Override
    void library_details() {
        System.out.println("Library Details. Capacity is "+library_util.seat_cap);
    
    }
    
    @Override
    public void issuebook() {
        System.out.println("Book issued");
    
    }
    
    @Override
    public void returnbook() {
        System.out.println("Book returned");
    
    }
    
    public void getMemberDetails() {
        System.out.println("member details");
    }
    
    public static void main(String[] args) {
        Question_1 librarySystem = new Question_1();
        librarySystem.library_details();
        librarySystem.getMemberDetails();
        librarySystem.issuebook();
        librarySystem.returnbook();
    }
}
