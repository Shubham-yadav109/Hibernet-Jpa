package com.example.demo.TestIngWork;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private int age;
    private String name;


    public User(){}

    public User(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
}