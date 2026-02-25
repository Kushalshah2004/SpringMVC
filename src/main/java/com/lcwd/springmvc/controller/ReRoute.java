package com.lcwd.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ReRoute {

    private final ApplicationContext applicationContext;

    public ReRoute(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    // using redirect
    @RequestMapping(path = "/one",method = RequestMethod.GET)
    public String one(@RequestParam int userid){
        System.out.println("This is one handler");
        if (userid==1){
            return "redirect:/contact";
        }
        return "redirect:/about";
    }

    @RequestMapping(path="/two",method = RequestMethod.GET)
    public String two(){
        System.out.println("This is two handler");
        return "";
    }

    @RequestMapping(path = "/three", method = RequestMethod.GET)
    public RedirectView three(){
        System.out.println("This is using redirect view");
        System.out.println("This is three handler");
        return new RedirectView("about");
    }

    @RequestMapping(path = "/four", method = RequestMethod.GET)
    public RedirectView four(){
        System.out.println("This is using redirect view");
        System.out.println("This is four handler");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.google.com");
        return redirectView;
    }


    /*
        using response.sendRedirect();
        you can use include and forward

        this both done on server side
            include: it add content of one servlet or jsp page into main page
            forward: it send request to other servlet and that servlet give response but in utl it have old servlet url

        this done on client side
            sendRedirect: it done on client side client make new request ti server
    */
    @RequestMapping(path = "/five", method = RequestMethod.GET)
    public void five(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect("contact");
    }
}
