package com.usys.foodie.repository;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ResourceBundle;

@Service
public class DataSource {
    String url;
    String user;
    String pass;

    public void getResource() {
        ResourceBundle resourceBundle =ResourceBundle.getBundle("application");
        this.url =resourceBundle.getString("jdbc.url");
        this.user =resourceBundle.getString("jdbc.user");
        this.pass =resourceBundle.getString("jdbc.pass");
    }
}
