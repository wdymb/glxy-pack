package com.glsc.model.user.controller;

import com.glsc.model.user.bean.pojo.User;
import com.glsc.model.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年06月27日 18:00
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUser();
    }

    @PostMapping("/user")
    public boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
