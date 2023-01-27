package com.aitu;

import java.util.Random;

public class Student extends Person{

    private int floor;
    private int flat;
    private int numberOfComplaints;

    public Student(String firstName, String lastName,
                   int age, int id, int floor, int flat,
                   int numberOfComplaints) {
        super(firstName, lastName, age, id);
        this.floor = floor;
        this.flat = flat;
        this.numberOfComplaints = numberOfComplaints;
    }

    public void sendRequest() {

    }

    public void pay() {

    }
}
