package com.example.postdemo.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    private int id;
    private String studentName;
    private double gpa;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Course> courses;
}
