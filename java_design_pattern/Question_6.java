interface pizza{
    void cook();
}

class Pizza implements pizza{
    
    @Override
    public void cook() {
        System.out.println("cooking pizza");
    }
}

class PizzaDecorator extends Pizza {
    private Pizza pizza;
    
    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public void decorate() {
        
        this.pizza.cook();
        System.out.println("now deocrating pizza with topings");
        
    }
}
public class Question_6 {
    
    public static void main(String[] args) {
        //Implement Decorator pattern to decorate the Pizza with topings.
        PizzaDecorator pizzaDecorator= new PizzaDecorator(new Pizza());
        pizzaDecorator.decorate();
    }
}
