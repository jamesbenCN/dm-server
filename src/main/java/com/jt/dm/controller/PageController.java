package com.jt.dm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("loginName", "admin");
        model.addAttribute("loginId", "27");
        return "index";
    }


    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
