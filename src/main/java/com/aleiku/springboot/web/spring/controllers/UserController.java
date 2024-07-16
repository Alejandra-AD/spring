package com.aleiku.springboot.web.spring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){//Para modelo vista controlador
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("name", "Alejandra");
        model.addAttribute("lastname", "Araya Díaz");
        return "details";
    }

}
