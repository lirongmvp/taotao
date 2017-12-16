package com.example.springbootdemo.contrller;

import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lirong
 * @create 2017/12/16
 * @since 1.0.0
 */
@RestController
public class ControllerDemo {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public List<User> getUser(){
        return userService.get();
    }

    @GetMapping("/index")
      String hello(){
          return "你好！" ;
      }
}
