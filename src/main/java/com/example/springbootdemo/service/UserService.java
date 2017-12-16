package com.example.springbootdemo.service;

import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lirong
 * @create 2017/12/16
 * @since 1.0.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> get(){
        return userMapper.getUser();
    }
}
