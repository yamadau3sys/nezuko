package com.usys.foodie.service;

import com.usys.foodie.domain.User;
import com.usys.foodie.usecase.UseCase;

import java.util.List;

public interface Service {
    List<User> selectAllUsers();
}
