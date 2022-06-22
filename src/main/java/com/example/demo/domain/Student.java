package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int Id;
    private String Name;
    private String Address;
    private double FinalScore;
}
