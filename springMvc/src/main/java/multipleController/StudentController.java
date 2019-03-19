package multipleController;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentController extends MultiActionController {
    
    
    
    public ModelAndView renderView(HttpServletRequest servletRequest,
                                   HttpServletResponse servletResponse){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("studentView");
        modelAndView.addObject("name","adam");
        modelAndView.addObject("title","student controller");
        modelAndView.addObject("rollno","546465446");
        return modelAndView;
        
    }
    
    public void simplyReturn(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().print("<b>hello world</b>");
    }
}

