

package com.template.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    
    @GetMapping("/public/main")
    public String getPublic(){
        return "main";
    }
}
