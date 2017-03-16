package com.socialMedicals.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}

