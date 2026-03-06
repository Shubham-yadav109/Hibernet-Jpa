package com.example.demo.TestIngWork;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/today")
public  class ApiTest{

    @PostMapping("/newpost")
    public List<User> getUser(@RequestBody List<User> users){
        for(User user:users){
            System.out.println(user.getName());
            System.out.println(user.getAge());
        }
        return  users;
    }
}