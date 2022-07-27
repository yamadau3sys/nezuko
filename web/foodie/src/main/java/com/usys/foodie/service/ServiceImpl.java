package com.usys.foodie.service;


import com.usys.foodie.domain.User;
import com.usys.foodie.repository.Repository;
import com.usys.foodie.repository.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class ServiceImpl implements  Service{
    @Autowired
    Repository repository;

    @Override
    public List<User> selectAllUsers() {
        List<UserEntity> userEntities = repository.selectAll();
        return userEntities.stream().map(it -> toUser(it)).collect(Collectors.toList());
    }

    private User toUser(UserEntity userEntity) {
        return  new User(userEntity.getId(), userEntity.getName());
    }
}
