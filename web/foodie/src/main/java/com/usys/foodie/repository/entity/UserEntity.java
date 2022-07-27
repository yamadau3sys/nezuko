package com.usys.foodie.repository.entity;

import lombok.Getter;

@Getter
public class UserEntity {
    private String id;
    private String name;

    public UserEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
