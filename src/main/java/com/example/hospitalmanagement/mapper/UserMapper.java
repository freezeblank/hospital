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

    @Insert("INSERT INTO user (username, password, email, phone, created_at, updated_at,role) " +
            "VALUES (#{username}, #{password}, #{email}, #{phone_number}, now(), now(),'nurse')")
    void add(String username, String password, String email, String phone_number);

}
