package com.example.demo.repositories;

import com.example.demo.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentRepository implements IStudentRepository {

    public static ArrayList<Student> Students = new ArrayList<>();

    public StudentRepository() {
        Students.add(new Student(1,"Saman","Kuliyapitiya",74.22));
        Students.add(new Student(1,"Amal","Kurunegala",85.45));
        Students.add(new Student(1,"Kamal","Nikawaratiya",98));
        Students.add(new Student(1,"Nimal","Udubaddawa",54.66));
        Students.add(new Student(1,"Sapumal","Palugamuwa",28.21));
    }

    @Override
    public ArrayList<Student> GetAllStudents() {
        return Students;
    }

}
