package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void deleteUserById(String id);
    public void updateUser(User user);
    public User findOneUserById(String id);
    public List<User> findAllUser();
}
