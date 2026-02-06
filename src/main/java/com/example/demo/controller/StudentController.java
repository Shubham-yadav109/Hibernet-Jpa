package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.tut.Student_Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // POST API
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // GET API
    @GetMapping("/all")
    public Map<String, Object> getAllStudents() {
        List<Student> students = service.getAllStudents();

        Map<String, Object> response = new HashMap<>();

        if (students.isEmpty()) {
            response.put("status", false);
            response.put("code", 404);
            response.put("msg", "No students found");
            response.put("count", 0);
            response.put("data", students);
        } else {
            response.put("status", true);
            response.put("code", 200);
            response.put("msg", "Students fetched successfully");
            response.put("count", students.size());
            response.put("data", students);
        }

        return response;
    }

    @GetMapping("/HelloChekc")
    public Map<String,Object> getOneStudent(){
        List<Student> students =service.getAllStudents();

        Map<String ,Object> response=new HashMap<>();

        if(students.isEmpty()){
            response.put("status",false);
            response.put("code",404);
            response.put("MSG","API NOT RESPONSE YOU");
        }else{
            response.put("status",true);
            response.put("code",200);
            response.put("MSG","API DATA RETURN SUCCESSFUL");
            response.put("shubham",students);
        }
        return response;
    }
}
