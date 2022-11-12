package com.example.postdemo.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Course {
    @Id
    private int id;
    private String name;


    @ManyToMany(mappedBy = "courses")
    List<Student> roster;



}
