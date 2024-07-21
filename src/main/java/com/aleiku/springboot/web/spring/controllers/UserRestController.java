package com.aleiku.springboot.web.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserRestController {

    @GetMapping("/details2")
    public String details2(){

        Map< String, Object> jsonBody = new HashMap<>();
        jsonBody.put("name", "Rocco");
        jsonBody.put("lastname","Pug");

        return "details2";

    }

}
