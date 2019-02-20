public class Question_9 {
    
    enum house{
        bunglow(1000),flat(2000);
        private final int price;
        
        house(int t){
            this.price=t;
        }
        public int getPrice() {
            return this.price;
        }
    }
    public static void main(String[] args) {
        System.out.println("Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)");
        System.out.println( house.bunglow.getPrice());
    }
}
