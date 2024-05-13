package com.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserController {

    //pages for users
    //user dashboard
    @RequestMapping(value = "/dashboard")
    public String userDashboard(){
        System.out.println("works");

        return "user/dashboard";
    }

    //user contact page


    //user profile page
    @RequestMapping(value = "/profile")
    public String userProfile(){

        System.out.println("profile works");
        return "user/profile";
    }

    //user view contacts

    //user edit contact

    //user delete contact

    //user update contact

    //user search contact

}
