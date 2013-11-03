
package app.controller.test;
import app.model.Local;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class testcontroller {
    
   @RequestMapping(method = RequestMethod.GET) 
    public String index(Model model){
    model.addAttribute("mensaje", "METODO INDEX");
    return "test";
    
   }
   
   @RequestMapping("ejemplo") 
    public String ejemplo(Model model){
    model.addAttribute("mensaje", "METODO EJEMPLO");
    return "test";
       }
   
   
  @RequestMapping("guardar") 
    public String guardar(Model model, @RequestParam String nombres,  @RequestParam String apellidos){
    model.addAttribute("mensaje",nombres+" "+apellidos);
    return "test";
       }
}
