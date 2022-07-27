package com.usys.foodie.controller;


import com.google.gson.Gson;
import com.usys.foodie.model.RequestUsersDto;
import com.usys.foodie.usecase.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        RequestUsersDto value =  usecase.getUsers();
        return new Gson().toJson(value);
    }


}
