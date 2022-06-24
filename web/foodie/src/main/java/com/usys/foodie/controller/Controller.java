package com.usys.foodie.controller;


import com.usys.foodie.usecase.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    UseCase usecase;

    @GetMapping("/ping")
    public String hoge() {
        System.out.println("aho");
        return "pong";
    }


    @GetMapping("/users")
    public String getUsers() {
        usecase.getUsers();
        return  "users";
    }


}
