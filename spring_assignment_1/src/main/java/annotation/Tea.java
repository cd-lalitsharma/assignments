package annotation;

/*import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
@Component
@Repository*/
public class Tea implements HotDrink {
    
    @Override
    public void prepareHotdrink() {
        System.out.println("tea prepared");
    }
}
