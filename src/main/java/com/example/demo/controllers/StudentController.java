package com.example.demo.controllers;

import com.example.demo.domain.Student;
import com.example.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/students")
public class StudentController {

    @Autowired
    private IStudentService _studentService;

    @GetMapping(path = "best")
    public Student GetBestStudent() {
        return _studentService.FindBestStudentInTheClass();
    }
}
