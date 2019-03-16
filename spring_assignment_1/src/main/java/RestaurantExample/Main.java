package RestaurantExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayDeque;
import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) {
    
/*  Create a class Restaurant.
    Create an interface HotDrink with an abstract method prepareHotDrink.
    Create two classes Tea and ExpressTea which implements HotDrink Class.
    Create an instance variable of type HotDrink in Restaurant class.
    Configure Tea and ExpressTea classes beans in Spring XML.
    create a bean with the name teaRestaurant of type Restaurant which inject Tea object as dependency using setter method.
    
    
*/

/*  Get both the beans and invoke prepareHotDrink method via hotDrink
    instance variables.
    Try inner bean with expressTeaRestaurant.
*/
    
      
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurant=applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant.hotDrink.prepareHotDrink();
        
//       Code to test restaurantAutoWireByName
    
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurantAutoWireByName = context.getBean("restaurantAutoWireByName",Restaurant.class);
        restaurantAutoWireByName.hotDrink.prepareHotDrink();

//       Code to test restaurantAutoWireByConstructor

        ApplicationContext applicationContext1= new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurantAutoWireByConstructor = applicationContext.getBean("restaurantAutoWireByConstructor",Restaurant.class);
        System.out.println(restaurantAutoWireByConstructor.hotDrink);
        

    }
}
