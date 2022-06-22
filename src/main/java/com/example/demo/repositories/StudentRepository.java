package com.example.demo.repositories;

import com.example.demo.domain.Student;

import java.util.ArrayList;

public class StudentRepository implements IStudentRepository {

    public static ArrayList<Student> Students = new ArrayList<>();

    public StudentRepository() {
        //Students.add(new Student());
    }

    @Override
    public ArrayList<Student> GetAllStudents() {
        return Students;
    }
}
