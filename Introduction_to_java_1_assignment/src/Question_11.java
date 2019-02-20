class  bank{
    int rateOfInterest=1;
    String name;
    public  void getDetails(){
    
    }
}

class sbi extends bank{
    sbi(){
        super.name="sbi";
        super.rateOfInterest=2;
    }
    public  void getDetails(){
        System.out.println(name + " has rate of interest of "+ rateOfInterest);
    }

}

class boi extends bank{
    boi(){
        this.name="boi";
        this.rateOfInterest=4;
    }
    public  void getDetails(){
        System.out.println(name + " has rate of interest of "+ rateOfInterest);
    }
}

class icici extends bank{
    icici(){
        this.name="icici";
        this.rateOfInterest=5;
    }
    public  void getDetails(){
        System.out.println(name + " has rate of interest of "+ rateOfInterest);
    }
}

public class Question_11 {
    
    public static void main(String[] args) {
        System.out.println("Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks");
        sbi sbiBank = new sbi();
        boi boiBank = new boi();
        icici iciciBank = new icici();
        sbiBank.getDetails();
        boiBank.getDetails();
        iciciBank.getDetails();
    }

}
