package com.usys.foodie.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Service
public class Repository {
    @Autowired
    DataSource dataSource;
    public void selectAll() {

        dataSource.getResource();

        try(Connection connection = DriverManager.getConnection(dataSource.url, dataSource.user, dataSource.pass);) {
            System.out.println("接続成功");


        }catch (SQLException sqe) {
            sqe.printStackTrace();
        }
    }






}
