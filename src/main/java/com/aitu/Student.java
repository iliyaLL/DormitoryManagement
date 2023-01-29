package com.aitu;

import java.util.ArrayList;

public class Student extends Person{

    private int floor;
    private int room;
    private int numberOfComplaints = 0;
    private int id;
    private static ArrayList<Integer> id_gen = new ArrayList<>();
    private static int i = 0;

    public Student(String firstName, String lastName,
                   int age, int id) {
        super(firstName, lastName, age);

        if (i >= 1) {
            for (int j = 0; j < i; j++) {
                if (id == id_gen.get(j)) {
                    throw new IllegalArgumentException("id already exists");
                }
            }
        }

        id_gen.add(id);
        i++;

        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getRoom() {
        return room;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumberOfComplaints() {
        return numberOfComplaints;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setNumberOfComplaints(int numberOfComplaints) {
        this.numberOfComplaints = numberOfComplaints;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I am a student");
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ", floor "
                + getFloor() + ", room " + getRoom()
                + ", complaints: " + numberOfComplaints;
    }
}
