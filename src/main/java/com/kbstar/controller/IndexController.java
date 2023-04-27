package com.kbstar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("center","about");
        return "index";
    }
    @RequestMapping("/property")
    public String property(Model model){
        model.addAttribute("center","property");
        return "index";
    }
    @RequestMapping("/blog")
    public String blog(Model model){
        model.addAttribute("center", "blog");
        return "index";
    }
    @RequestMapping("/contact")
    public String contact(Model model){
        model.addAttribute("center", "model");
        return "index";
    }
}
