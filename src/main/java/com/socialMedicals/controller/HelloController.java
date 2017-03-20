package com.socialMedicals.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("message","esto es una prueba");
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("foo");
        return "foo";
    }
}

