package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.validation.constraints.Min;
import java.util.List;

/**
 * @author lirong
 * @create 2017/12/16
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {
    @Results(id = "userResult",value = {
           @Result(property = "userid",column = "uesrid")
    })
    @Select("select uesrid,username,password from t_user")
    public List<User> getUser();
}