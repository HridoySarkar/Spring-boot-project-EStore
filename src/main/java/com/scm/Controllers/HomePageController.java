package com.scm.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.Helper.Message;
import com.scm.Helper.MessageType;
import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomePageController {

    @Autowired
    private UserService userService;



    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Hridoy");
        model.addAttribute("age", "24");
        return "home";
    }

    // services
    @RequestMapping("/services")
    public String service() {
        System.out.println("Service working");
        return "services";
    }

    // about
    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("isLogin", false);
        System.out.println("About working");
        return "about";
    }

    // contact
    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("isLogin", false);
        System.out.println("contact working");
        return "contact";
    }

    // login
    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("isLogin", false);
        System.out.println("About working");
        return "login";
    }

    // signup
    @RequestMapping("/signup")
    public String signup(Model model) {
        UserForm userForm = new UserForm();
        //default data for testing
        // userForm.setPhoneNumber("012542");
        // userForm.setName("Hridoy");
        // userForm.setPassword("1234");
        // userForm.setAbout("Hello world");
        // userForm.setEmail("khanh3453@gmail.com");
        model.addAttribute("userForm", userForm);
        
        return "signup";
    }

    // signup
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegister(@Valid @ModelAttribute UserForm userForm,BindingResult rBindingResult, HttpSession session) {

       System.out.println("Process working");
        // fetch data from form
        System.out.println(userForm);

        // validation
        if(rBindingResult.hasErrors()){
            return "signup";
        }

        // save to database


        //userService
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setAbout(userForm.getAbout());
        user.setProfilePic("src\\main\\resources\\static\\images\\defaultProfile.jpg");
        
        User savedUser = userService.saveUser(user);

        System.out.println("savedUser");
        // show message

        Message message = Message.builder().content("Registration Successful").type(MessageType.green).build();
        session.setAttribute("signUpMessageBox", message);

        // redirect

        return "redirect:/signup";
    }

}
