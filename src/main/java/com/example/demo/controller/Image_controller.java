package com.example.demo.controller;


import com.example.demo.repository.Image_Repo;
import com.example.demo.service.StudentService;
import com.example.demo.tut.Student_Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/Image")
public class Image_controller {

    @Autowired
    private StudentService service;
    @Autowired
    private Image_Repo studentImageRepository;

    @PostMapping("/upload")
    public  String uploadImage(@RequestParam("file")MultipartFile file) throws  Exception{

        Student_Image student=new Student_Image();

        student.setImageData(file.getBytes());
        student.setImageType(file.getContentType());
        student.setImageName(file.getOriginalFilename());

        studentImageRepository.save(student);
        return  "Image Saved Successful";
    }

}
