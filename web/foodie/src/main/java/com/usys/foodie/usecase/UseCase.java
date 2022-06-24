package com.usys.foodie.usecase;

import com.usys.foodie.domain.User;
import com.usys.foodie.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@org.springframework.stereotype.Service
public class UseCase {
    @Autowired
    Service service;

    public void getUsers() {
        List<User> users = service.selectAllUsers();
    }
}
