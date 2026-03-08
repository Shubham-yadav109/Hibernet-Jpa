package com.example.demo.TestIngWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserInterface userInterface;

    public User saveUser(User user){
        return userInterface.save(user);
    }

//    public List<User> getAll(){
//        return userInterface.findAll();
//    }

    public User getUserById(int id){
        return userInterface.findById(id).orElse(null);
    }
}