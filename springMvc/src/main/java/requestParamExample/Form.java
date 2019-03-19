package requestParamExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Form {

    @RequestMapping("/form")
    String form(){
        return "form";
    }
    
    @RequestMapping(value = "/formHandler", method = RequestMethod.POST)
    @ResponseBody
    String formHandler(@RequestParam("name") String name,
                       @RequestParam("age") String age){
    return name+" has age "+age;
    }

}
