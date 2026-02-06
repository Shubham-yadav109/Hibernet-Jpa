package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;
import com.example.demo.tut.Student_Image;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    List<Student> getOneStudent();

    List<Student_Image> getDataResponse();
}
