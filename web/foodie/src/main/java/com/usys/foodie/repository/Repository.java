package com.usys.foodie.repository;

import com.usys.foodie.repository.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class Repository {
    @Autowired
    DataSource dataSource;
    public List<UserEntity> selectAll() {

        dataSource.getResource();
        
        List<UserEntity> userEntities = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(dataSource.url, dataSource.user, dataSource.pass);) {
            String sql="SELECT * FROM person ";
            Statement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                userEntities.add(toUserEntity(id,name));
            }

        }catch (SQLException sqe) {
            sqe.printStackTrace();
        }
        return  userEntities;
    }

    private UserEntity toUserEntity(String id, String name) {
        return new UserEntity(id,name);
    }


    

}
