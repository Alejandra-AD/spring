package com.aleiku.springboot.web.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleiku.springboot.web.spring.dto.ParamDto;
import com.aleiku.springboot.web.spring.dto.UserDTO;
import com.aleiku.springboot.web.spring.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/path")
public class PathVariableParamController {

    private User userEntity;


    @GetMapping("/{message}")
    public ParamDto pathVariableMethod(@PathVariable String message) {
        Integer code = 111;
        ParamDto paramDto = new ParamDto(message, code);
        return paramDto;
    }  



    @GetMapping("/{id}/{producto}")
    public Map< String , Object > pathVariableProductoId(@PathVariable Long id, @PathVariable String producto) {
       
        Map<String , Object> productoMap = new HashMap<>();
        productoMap.put("id", id);
        productoMap.put("producto", producto);
        return productoMap;
    }

    @PostMapping("/users") 
    public User createUser(@RequestBody UserDTO user) {

        UserDTO userDTO = new UserDTO(user.name(), user.lastname(), user.email());
        User newUser = new User(userDTO.name(), userDTO.lastname(),userDTO.email());// se utiliza un repositorio para agregar el usuario a la bbdd
        return newUser;
    }
    
    

}
