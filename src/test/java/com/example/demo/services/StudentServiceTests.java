package com.example.demo.services;

import com.example.demo.domain.Student;
import com.example.demo.repositories.IStudentRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StudentServiceTests {

    @Mock
    IStudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;

    ArrayList<Student> mockStudents = new ArrayList<Student>();

    @BeforeAll
    void setMockStudentData() {
        mockStudents.add(new Student(1, "Saman", "Kuliyapitiya", 74.22));
        mockStudents.add(new Student(1, "Amal", "Kurunegala", 85.45));
        mockStudents.add(new Student(1, "Kamal", "Nikawaratiya", 98));
        mockStudents.add(new Student(1, "Nimal", "Udubaddawa", 54.66));
        mockStudents.add(new Student(1, "Sapumal", "Palugamuwa", 28.21));
    }

    @Test
    void FindBestStudentInTheClass_Returns_Best() {
        //Arrange
        when(studentRepository.GetAllStudents()).thenReturn(mockStudents);

        //Act
        Student best = studentService.FindBestStudentInTheClass();

        //Assert
        assertNotNull(best);
        assertEquals(best.getId(), 1);
        assertEquals(best.getName(), "Kamal");
        assertEquals(best.getAddress(), "Nikawaratiya");
        assertEquals(best.getFinalScore(), 98);
    }

    @Test
    void FindBestStudentInTheClass_Returns_Null() {
        //Arrange
        when(studentRepository.GetAllStudents()).thenReturn(new ArrayList<Student>());

        //Act
        Student best = studentService.FindBestStudentInTheClass();

        //Assert
        assertNull(best);
    }

}
