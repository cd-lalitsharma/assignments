package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/*import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
@Component
@Repository*/
public class Restaurant {

//    @Autowired
//    @Qualifier("tea")
    HotDrink hotDrink;
    
/*    @Autowired
    public Restaurant(@Qualifier("expressTea") HotDrink hotDrink){
        this.hotDrink=hotDrink;
    }*/
    
    @Autowired
    @Qualifier("expressTea")
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
    
    public void prepareHotDrink(){
        hotDrink.prepareHotdrink();
    }
   
    
    
}
