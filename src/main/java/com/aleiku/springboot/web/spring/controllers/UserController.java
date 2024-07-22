package com.aleiku.springboot.web.spring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aleiku.springboot.web.spring.models.User;


@Controller
public class UserController {

    User user = new User("Alejandra", "Araya");

    @GetMapping("/details")
    public String details(Model model){//Para modelo vista controlador
        model.addAttribute("title", "Datos usuario");
        model.addAttribute("user", user);
        return "details";
    }

}
