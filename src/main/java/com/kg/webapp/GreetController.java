package com.kg.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

@RequestMapping(path= "/greet/{name}",method = RequestMethod.GET)
public ModelAndView helloWorld(@PathVariable String name) {
        String greet =" Hello !!!" + name + " How are You?";
        System.out.println(greet);
        return new ModelAndView("greet", "greet", greet);
    }

    // @RequestMapping(path= "/greet/{name}",method = RequestMethod.GET)
    // public String greet(@PathVariable String name,Model model) {
    //     String greet =" Hello !!!" + name + " How are You?";
    //     model.addAttribute("greet", greet);
    //     System.out.println(greet);
    //     return "greet";
    // }

    // @RequestMapping(path= "/greet/{name}",method=RequestMethod.GET)    
    // public String greet(@PathVariable String name, ModelMap model){
    //     String greet =" Hello !!!" + name + " How are You?";
    //     model.addAttribute("greet", greet);
    //     System.out.println(greet);

    //     return "greet";
    // }

    // https://stackoverflow.com/questions/25988442/what-is-the-difference-between-return-modelandview-and-return-string-in-spring-m
    // https://stackoverflow.com/questions/18486660/what-are-the-differences-between-model-modelmap-and-modelandview
    // http://www.baeldung.com/spring-requestmapping
    
}