package com.aitu;

import java.util.ArrayList;

public class Administrator extends Employee implements IControl{

    private ArrayList<Student> studentRooms = new ArrayList<>();

    public Administrator(String firstName, String lastName, int age, int id,
                         double salary, double bonus) {
        super(firstName, lastName, age, id, salary, bonus);
    }

    @Override
    public void add(Student student, int floor, int room) {
        room = floor * room;
        studentRooms.add(student);
    }

    @Override
    public void delete(Student student) {
        studentRooms.remove(student);
    }
}
