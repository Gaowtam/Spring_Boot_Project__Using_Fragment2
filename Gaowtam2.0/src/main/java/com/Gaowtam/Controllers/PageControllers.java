package com.Gaowtam.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControllers {
    @RequestMapping("/nabela")
    public String home(Model model)
    {
        model.addAttribute("name", "Welcome To The Home Page");
        model.addAttribute("youtubeChannel", "Jmuna TV");
        model.addAttribute("githubRepo","https://github.com/Gaowtam");
        return "home";
    }

    //about

    @RequestMapping("/about")
    public String aboutPage(Model model)
    {
        model.addAttribute("islogin",false);
        return "about";
    }
    
    //services
    @RequestMapping("/services")
    public String servicesPage()
    {
        return "services";
    }
}
