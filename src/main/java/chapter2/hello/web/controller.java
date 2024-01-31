package chapter2.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class controller {

    @RequestMapping("hello")

    public String name(@RequestParam (name="name") String name,
    @RequestParam (name="age") Integer age,
    Model model){
        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "hello";
    }


   
    
}
