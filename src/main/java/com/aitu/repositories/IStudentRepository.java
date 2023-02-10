package com.aitu.repositories;

import com.aitu.entities.Student;

import java.util.ArrayList;

public interface IStudentRepository {

    boolean addStudent(Student student);
    Student getStudent(int id);
    ArrayList<Student> getAllStudents();
}
