package com.hc.controller;

import com.hc.model.IMoocJSONResult;
import com.hc.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setAge(11);
        user.setBirthday(new Date());
        user.setName("哈哈2");
        user.setPassword("123456");
        return user;
    }

    /**
     * 返回json对象
     * @return
     */
    @RequestMapping("/getUserJson")
    public IMoocJSONResult getUserJson(){
        User user = new User();
        user.setAge(191);
        user.setBirthday(new Date());
        user.setName("哈哈1a 1");
        user.setPassword("1234567");
        return IMoocJSONResult.ok(user);
    }
}
