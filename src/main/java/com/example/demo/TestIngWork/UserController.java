package com.example.demo.TestIngWork;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/new")
public class UserController {


    @Autowired
    private  UserService userService;

    @PostMapping("/type")
    public User getUser(@RequestBody  User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        return userService.saveUser(user);
    }

//    @GetMapping("/GetAll")
//    public List<User> getAllUser(){
//        return userService.getAll();
//    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }
}