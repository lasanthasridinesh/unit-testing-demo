package com.example.demo.services;

import com.example.demo.domain.Student;
import com.example.demo.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository _studentRepository;

    @Override
    public Student FindBestStudentInTheClass() {
        var students = _studentRepository.GetAllStudents();
        if (students.stream().findAny().isPresent()) {
            var maxScoreStudent = students.stream().max(Comparator.comparingDouble(Student::getFinalScore)).get();
            return maxScoreStudent;
        }
        return null;
    }
}
