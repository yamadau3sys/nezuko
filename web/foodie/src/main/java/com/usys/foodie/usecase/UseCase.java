package com.usys.foodie.usecase;

import com.usys.foodie.domain.User;
import com.usys.foodie.model.RequestUsersDto;
import com.usys.foodie.model.UserDto;
import com.usys.foodie.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;


@org.springframework.stereotype.Service
public class UseCase {
    @Autowired
    Service service;

    public RequestUsersDto getUsers() {
        List<User> users = service.selectAllUsers();

        List<UserDto> data = users.stream().map(it -> toUserDto(it)).collect(Collectors.toList());

        return new RequestUsersDto(data);
    }

    private UserDto toUserDto(User user) {
        return new UserDto(user.getId(),user.getName());
    }
}
