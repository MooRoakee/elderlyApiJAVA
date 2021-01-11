package com.roakee.practice04.controller;


import com.roakee.practice04.entity.User;
import com.roakee.practice04.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public   class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/select")
    public User selectWithName(@RequestParam String name) {
        List<User> ret = userMapper.selectUser(name);
        return ret.get(0);
    }

    @RequestMapping("/delete")
    public String deleteWithName(@RequestParam String name) {
        userMapper.deleteUser(name);
        return "delete success";
    }

    @RequestMapping("/insert")
    public String insertUser(@RequestParam String name, @RequestParam String pwd) {
        userMapper.insertUser(name, pwd);
        return "insert success";
    }

    @RequestMapping("/update")
    public String updateUser(@RequestParam String field, @RequestParam String value, @RequestParam String name) {
        userMapper.updateUser(field,value,name);
        return "update success";
    }
}
