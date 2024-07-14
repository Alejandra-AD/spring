package com.aleiku.springboot.web.spring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("name", "Alejadra");
        model.addAttribute("lastname", "Araya Díaz");
        return "details";
    }

}
