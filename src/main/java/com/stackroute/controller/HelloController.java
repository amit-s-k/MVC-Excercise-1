package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hey")
    public String sayHello(Model model){
        model.addAttribute("msg","Hello Earth");
        return "index";
    }

    @RequestMapping("login")
    public String showLoginPage(){
        return "login";
    }
    @RequestMapping("showMessage")
    public ModelAndView showMessagePage(@RequestParam("firstName") String userName,@RequestParam("password") String password){
        ModelAndView modelAndView =new ModelAndView();
        User user=new User();
        user.setUserName(userName);
        user.setPassword(password);
        modelAndView.setViewName("message");
        modelAndView.addObject("userObject",user);
        return modelAndView;
    }
}
