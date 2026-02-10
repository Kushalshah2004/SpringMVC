package com.lcwd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println(model.getClass());
        System.out.println("This is home url");
        model.addAttribute("name","Kushal Shah");
        model.addAttribute("id",1);
        List<String > abcd = new ArrayList<>();
        abcd.add("abcd");
        abcd.add("efgh");
        abcd.add("ijkl");
        abcd.add("mnop");
        abcd.add("qrst");
        abcd.add("uvwx");
        abcd.add("yz");
        model.addAttribute("abcd",abcd);
        return "home";
    }
    @RequestMapping(path="/about", method = RequestMethod.GET)
    public String about(){
        System.out.println("This is about url");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("This is help url");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Kushal Shah");
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
