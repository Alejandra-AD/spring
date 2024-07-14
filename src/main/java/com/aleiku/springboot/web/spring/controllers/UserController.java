package com.aleiku.springboot.web.spring.controllers;

import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    @PostMapping
    public void helloWorld(){
        System.out.println("Hello World!");

    }

}
