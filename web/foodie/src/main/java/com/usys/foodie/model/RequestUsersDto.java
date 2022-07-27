package com.usys.foodie.model;

import lombok.Getter;

import java.util.List;

public class RequestUsersDto {
    List<UserDto> userDtoList;

    public RequestUsersDto(List<UserDto> userDtoList) {
        this.userDtoList = userDtoList;
    }
}
