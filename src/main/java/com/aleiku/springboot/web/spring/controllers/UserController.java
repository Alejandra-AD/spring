package com.aleiku.springboot.web.spring.controllers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.aleiku.springboot.web.spring.dto.UserDTO;
import com.aleiku.springboot.web.spring.models.User;


@Controller
public class UserController {

    User user = new User("Alejandra", "Araya", null);

    @GetMapping("/details")
    public String details(Model model){//Para modelo vista controlador

        UserDTO userDTO = new UserDTO(user.getName(),user.getLastname(),user.getEmail());
        model.addAttribute("title", "Datos usuario");
        model.addAttribute("user", user);
        return "details";
    }


    @GetMapping("/list")
    public String userList(ModelMap model){

        // List<User> users = new ArrayList<>(); //creando un lista vacia
        
        model.addAttribute("title", "Lista de usuarios");

        return "list";//se devuelve el nombre de la vista

    }

    @ModelAttribute("users")
    public List<User> usersListModel(){
        return Arrays.asList(
            new User("Ella", "Purnell", "email1@email.com"),
            new User("Gigi", "Hadid", "email2@email.com"),
            new User("Elsa", "De arendelle", "email3@email.com")
            );
    }

}
