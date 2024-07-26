package com.aleiku.springboot.web.spring.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.aleiku.springboot.web.spring.dto.ParamDto;
import com.aleiku.springboot.web.spring.models.Param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

@RequestMapping("/api/params")

public class RequestParamsController {

    private ParamDto paramJson;
    

    // @GetMapping("/foo")
    // public ParamDto foo(@RequestParam String message) {//recibo un get con el message

    //     paramJson = new ParamDto(message)
    //     return paramJson;

        
    // }

    @GetMapping("/footwo")
    public String ParamDto(@RequestParam String message , @RequestParam Integer code) {

        paramJson = new ParamDto(message, code);

        return new String();
    }
    

}
