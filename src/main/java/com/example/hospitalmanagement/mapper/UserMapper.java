package com.example.hospitalmanagement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hospitalmanagement.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(Integer id) ;

    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByUserName(String username) ;

    @Select("SELECT * FROM user WHERE email = #{email}")
    User findByEmail(String email);

    @Select("SELECT * FROM user WHERE phone = #{phone}")
    User findByPhoneNumber(String phone);

    @Insert("INSERT INTO user (username, password,name, email,role, phone,gender, created_at, updated_at) " +
            "VALUES (#{username}, #{password},#{name}, #{email},'user', #{phone_number},#{gender}, now(), now())")
    void add(String username, String password, String email, String phone_number, String name, Character gender);


}
