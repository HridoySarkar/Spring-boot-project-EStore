package com.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Hridoy");
        model.addAttribute("age","24");
        return "home";
    }

    // services
    @RequestMapping("/services")
    public String service(){
        System.out.println("Service working");
        return "services";
    }
    // about
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("isLogin",false);
        System.out.println("About working");
        return "about";
    }

    //contact
    @RequestMapping("/contact")
    public String contact(Model model){
        model.addAttribute("isLogin",false);
        System.out.println("contact working");
        return "contact";
    }

    //login
    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("isLogin",false);
        System.out.println("About working");
        return "login";
    }

    //signup
    @RequestMapping("/signup")
    public String signup(Model model){
        model.addAttribute("isLogin",false);
        System.out.println("About working");
        return "signup";
    }

}
