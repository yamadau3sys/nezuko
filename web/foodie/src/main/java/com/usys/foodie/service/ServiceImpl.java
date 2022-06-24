package com.usys.foodie.service;


import com.usys.foodie.domain.User;
import com.usys.foodie.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements  Service{
    @Autowired
    Repository repository;

    @Override
    public List<User> selectAllUsers() {
        repository.selectAll();
        return null;
    }
}
