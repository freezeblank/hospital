package com.example.hospitalmanagement.service;

import com.example.hospitalmanagement.pojo.User;

public interface UserService {
    User findById(Integer id);

    User findByUserName(String username);

    User findByEmail(String email);
    
    User findByPhoneNumber(String phone);


    void register(String username, String password, String email, String phone,String name,Character gender);
}
