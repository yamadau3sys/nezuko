package com.usys.foodie.domain;

import lombok.Data;
import lombok.Getter;

@Getter
public class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
