package com.outerpack.service.impl;

import com.outerpack.entity.pojo.User;
import com.outerpack.mapper.UserMapper;
import com.outerpack.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public Boolean changePassword(String username, String password) {
        int result=userMapper.changePassword(username,password);
        return result>0;
    }

    @Override
    public User getUserPowerByID(Integer id) {
        return userMapper.getUserPowerByID(id);
    }
}
