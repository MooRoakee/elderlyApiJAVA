package com.roakee.practice04.mapper;

import com.roakee.practice04.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where name=#{name}")
    List<User> selectUser(String name);

    @Delete("delete from user where name=#{name}")
    void deleteUser(String name);

    @Insert("Insert into user (name,pwd)values(#{name},#{pwd})")
    void insertUser(String name,String pwd);

    @Update("update user set #{field}=#{value} where name=#{name}")
    void updateUser(String field,String value,String name);
}
