package com.example.hospitalmanagement.service.impl;

import com.example.hospitalmanagement.mapper.UserMapper;
import com.example.hospitalmanagement.pojo.User;
import com.example.hospitalmanagement.service.UserService;
import com.example.hospitalmanagement.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findById(Integer id) {
        User user = userMapper.findById(id);
        return user;
    }

    @Override
    public User findByUserName(String username) {
        User user = userMapper.findByUserName(username);
        return user;
    }

    @Override
    public User findByEmail(String email) {
        User user = userMapper.findByEmail(email);
        return user;
    }

    @Override
    public User findByPhoneNumber(String phone) {
        User user = userMapper.findByPhoneNumber(phone);
        return user;
    }

    @Override
    public void register(String username, String password, String email, String phone,String name,Character gender) {
        System.out.println(password);
        String md5String = Md5Util.getMD5String(password);
        userMapper.add(username, md5String, email, phone,name,gender);
    }
}
