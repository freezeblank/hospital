package com.example.hospitalmanagement.controller;

import com.example.hospitalmanagement.pojo.Result;
import com.example.hospitalmanagement.pojo.User;
import com.example.hospitalmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        // 检查用户名是否已存在
        if (userService.findByUserName(user.getUsername()) != null) {
            return Result.failed("用户名已存在");
        }
        // 检查电子邮箱是否已存在
        if (userService.findByEmail(user.getEmail()) != null) {
            return Result.failed("电子邮箱已存在");
        }
        // 检查手机号是否已存在
        if (userService.findByPhoneNumber(user.getPhone()) != null) {
            return Result.failed("手机号已存在");
        }
        // 注册用户
        userService.register(user.getUsername(), user.getPassword(), user.getEmail(), user.getPhone());
        return Result.success();
    }
    }
}
