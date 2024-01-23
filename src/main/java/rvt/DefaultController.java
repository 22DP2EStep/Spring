package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    
    }
    

    @GetMapping(value = "/test")
    ModelAndView testAction(){
        
        ModelAndView modelAndView = new ModelAndView("test");
        Money macins1 = new Money(10, 20);
        Money macins2 = new Money(5, 10);
        Money macins3 = new Money(2, 19);

        modelAndView.addObject("macins1", macins1);
        modelAndView.addObject("macins2", macins2);
        
        modelAndView.addObject("summa", macins1.plus(macins2));
        modelAndView.addObject("starpiba", macins1.minus(macins3));


        Money macins4 = new Money(10, 90);
        Money macins5 = new Money(5, 90);
        Money macins6 = macins4.minus(macins5);
        modelAndView.addObject("starpiba2", macins6 = macins4.minus(macins5));

        Money macins7 = new Money(10, 0);
        Money macins8 = new Money(5, 0);
        Boolean macins9 = macins7.lessThan(macins8);
        modelAndView.addObject("mazak1", macins9);

        return modelAndView;


    }
    



}


