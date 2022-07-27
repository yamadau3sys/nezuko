package com.usys.foodie.model;

import lombok.Data;
import lombok.Getter;

@Getter
public class UserDto {
    String id;
    String name;

    public UserDto(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
