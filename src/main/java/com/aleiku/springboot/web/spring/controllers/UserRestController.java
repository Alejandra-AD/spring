package com.aleiku.springboot.web.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.aleiku.springboot.web.spring.dto.UserDTO;
import com.aleiku.springboot.web.spring.models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class UserRestController {

    User user = new User("Ale", "Araya",null);


    @GetMapping("/details")
    public UserDTO details2(){

        UserDTO userDTO = new UserDTO(user.getName(),user.getLastname(),user.getEmail());
        System.out.println(userDTO);
        return userDTO;
    }

}
