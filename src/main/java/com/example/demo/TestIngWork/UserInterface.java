package com.example.demo.TestIngWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User,Integer> {
}