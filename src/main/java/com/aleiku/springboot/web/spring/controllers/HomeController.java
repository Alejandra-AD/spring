package com.aleiku.springboot.web.spring.controllers;

import javax.management.monitor.GaugeMonitor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/","/home"})
    public String getHome(){

        return "redirect:/details";
    }

}
