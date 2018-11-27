package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    public void insertUser(User user);
    public void delectUserById(String id);
    public void updateUser(User user);
    public User selectOneUserById(String id);
    public List<User> selectAllUser();
}
