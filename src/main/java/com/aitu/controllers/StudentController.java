package com.aitu.controllers;

import com.aitu.entities.Student;
import com.aitu.exceptions.AgeOutOfBoundsException;
import com.aitu.exceptions.UserExistsException;
import com.aitu.repositories.IStudentRepository;

import java.util.ArrayList;

public class StudentController {

    private final IStudentRepository repository;

    public StudentController(IStudentRepository repository) {
        this.repository = repository;
    }

    public String addStudent (String name, String surname, int age, int floor, int room) throws UserExistsException, AgeOutOfBoundsException {
        Student student = new Student(name, surname, age, floor, room);

        boolean added = repository.addStudent(student);

        if (added) System.out.println(String.format("floor: %d, room: %d", floor, room));

        return (added ? "Student was added!" : "Student adding was failed!");
    }

    public String removeStudent (int id) {
        Student student = repository.removeStudent(id);

        return student == null ? "Student doesn't exist" : "Student was removed";
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
