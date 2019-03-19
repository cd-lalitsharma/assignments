package modelBinding;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class studentController {
        
        @ModelAttribute
        void defaultModel(Model model){
            model.addAttribute("heading","spring mvc container");
            
            
        }
        @RequestMapping(value = "/stco/",method = RequestMethod.POST)
        String studentController(@ModelAttribute StudentCo studentCo,Model model){ 
            model.addAttribute("firstName",studentCo.getFirstName());
            model.addAttribute("lastName",studentCo.getLastName());
            return  "modelView";
        }
}
