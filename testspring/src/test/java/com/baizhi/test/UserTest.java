package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setUsername("idea");
        user.setPassword("654321");
        userDao.insertUser(user);
    }

    @Test
    public void testDelectUser(){
        userDao.delectUserById("527eca7f334945a587ac8d68ce27caa3");
        System.out.println("删除成功");
    }
    @Test
    public void testSelectOneUser(){
        User user = userDao.selectOneUserById("6269eff11cfe4ea9924f06e11755fc35");
        System.out.println(user);
    }

    @Test
    public void testSelectAllUser(){
        List<User> users = userDao.selectAllUser();
        for (User user:users
             ) {
            System.out.println(user);
        }
    }

}
