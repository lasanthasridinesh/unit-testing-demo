package com.example.demo.controllers;

import com.example.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/assets")
public class StudentController {

    @Autowired
    private final IStudentService _studentService;

    public StudentController(IStudentService studentService) {
        _studentService = studentService;
    }
}
