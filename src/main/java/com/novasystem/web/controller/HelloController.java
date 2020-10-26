package com.novasystem.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("name", "SpringBlog from Millky");
        System.out.println("a");
        return "hello";
    }
}