package com.glsc.model.user.controller;

import com.glsc.model.user.bean.pojo.User;
import com.glsc.model.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/user/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return userService.delete(id);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
