package RestaurantExample;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
    
    HotDrink hotDrink;
    
    public Restaurant(){}
    
    public Restaurant(HotDrink hotDrink){
        this.hotDrink=hotDrink;
        System.out.println("Restaurant Constructor invoked");
    }
    
    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
        
    }
}
