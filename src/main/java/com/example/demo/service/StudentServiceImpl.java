package com.example.demo.service;

import java.util.List;

import com.example.demo.tut.Student_Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public List<Student> getOneStudent() {
        return List.of();
    }

    @Override
    public List<Student_Image> getDataResponse() {
        return List.of();
    }
//    @Override
//    public List<Student> getOneStudent(){return  repo.findAll();
//    }
}
