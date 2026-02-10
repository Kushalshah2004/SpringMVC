package com.lcwd.springmvc.controller;

import com.lcwd.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

    @ModelAttribute
    public void commonData(Model model,HttpServletRequest httpServletRequest){
        model.addAttribute("requesttype",httpServletRequest.getMethod());
        model.addAttribute("requesturl", httpServletRequest.getRequestURL());
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    /* using servlet (old method )*/
    /*
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(HttpServletRequest httpServletRequest){
        String email = httpServletRequest.getParameter("useremail");
        String name = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("userpassword");
        System.out.println(email + "\n" + name + "\n" + password);
        return "";
    }*/

    /* RequestField annotation*/
    /*@RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(
            @RequestParam("useremail") String userEmail,
            @RequestParam("username") String userName,
            @RequestParam("userpassword") String userPassword,
            Model model){
        System.out.println(userEmail + "\n" + userName + "\n" + userPassword);
        model.addAttribute("name",userName);
        model.addAttribute("email",userEmail);
        model.addAttribute("password",userPassword);

        return "success";
    }*/

    /*Model attribute*/
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model){
        System.out.println(user);
        model.addAttribute("name",user.getUsername());
        model.addAttribute("email",user.getUseremail());
        model.addAttribute("password",user.getUserpassword());
        return "success";
    }

}
