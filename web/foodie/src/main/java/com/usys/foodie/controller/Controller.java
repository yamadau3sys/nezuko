package com.usys.foodie.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/ping")
    public String hoge() {
        System.out.println("aho");
        return "pong";
    }

}
