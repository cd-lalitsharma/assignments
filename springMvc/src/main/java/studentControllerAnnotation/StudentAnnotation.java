package studentControllerAnnotation;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@Controller
public class StudentAnnotation {
    
    @RequestMapping("/")
    @ResponseBody
    String india(){
        return "index string";
    }
    
    @RequestMapping("/viewWithoutModel")
    String viewWithoutModel(){
        return "viewWithoutModel";
    }
    
    @RequestMapping("/in")
    ModelAndView modelAndViewReturn(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("data","view returned from default mapping");
        modelAndView.addObject("titles","view returned from default mapping");
        return modelAndView;
    }
    
    @RequestMapping("/student/{name}/{rollNo}")
    @ResponseBody
    String pathVariableExample(@PathVariable("name") String name,
                               @PathVariable("rollNo") String rollNo){
        return name +" has roll no "+rollNo;
    }
    
    @RequestMapping("/pathMap/{key}/{value}")
    @ResponseBody
    String pathMap(@PathVariable Map<String,String> map){
    return " first path variable: "+map.get("key") + " second path variable: "+map.get("value");
    }
    
}
