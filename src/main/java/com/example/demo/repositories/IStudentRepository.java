package com.example.demo.repositories;

import com.example.demo.domain.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> GetAllStudents();
}
