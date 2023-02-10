package com.aitu.controllers;

import com.aitu.entities.Student;
import com.aitu.exceptions.UserExistsException;
import com.aitu.repositories.IStudentRepository;

import java.util.ArrayList;

public class StudentController {

    private final IStudentRepository repository;

    public StudentController(IStudentRepository repository) {
        this.repository = repository;
    }

    public String addStudent (String name, String surname, int age, int floor, int room) throws UserExistsException {
        Student student = new Student(name, surname, age, floor, room);

        boolean added = repository.addStudent(student);

        return (added ? "Student was added!" : "Student adding was failed!");
    }

    public String getStudent (int id) {
        Student student = repository.getStudent(id);

        return student == null ? "Student was not found" : student.toString();
    }

    public String getAllStudents () {
        ArrayList<Student> students = repository.getAllStudents();
        return students.toString();
    }
}
