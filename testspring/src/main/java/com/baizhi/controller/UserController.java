package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(User user){
        user.setId(UUID.randomUUID().toString().replace("-",""));
        userService.addUser(user);
    }

    @RequestMapping("removeUser")
    @ResponseBody
    public void removeUser(String id){
        userService.deleteUserById(id);
    }

    @RequestMapping("modifyUser")
    @ResponseBody
    public void modifyUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping("queryOneUserById")
    @ResponseBody
    public User queryOneUserById(String id){
        return userService.findOneUserById(id);
    }

    @RequestMapping("queryAllUser")
    @ResponseBody
    public List<User> queryAllUser(){
        return userService.findAllUser();
    }

}
