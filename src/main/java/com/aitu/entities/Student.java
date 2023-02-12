package com.aitu.entities;

import com.aitu.exceptions.UserExistsException;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    private int block;
    private int floor;
    private int room;
    private int id;
    private Scanner sc = new Scanner(System.in);

    public Student(int id, String firstName, String lastName,
                   int age, int floor, int room) throws UserExistsException {
        super(firstName, lastName, age);
        setFloorRoom(floor, room);
        setId(id);
    }

    public Student(String firstName, String lastName,
                   int age, int floor, int room) throws UserExistsException {
        super(firstName, lastName, age);
        setFloorRoom(floor, room);
        setId(id);
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

    public void setId(int id)
            throws UserExistsException {
        this.id = id;
    }

    public void setFloorRoom(int floor, int room) {
        this.room = room;
        this.floor = floor;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I am a student");
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() +
                " ID: " + getId() + ", floor " +
                getFloor() + ", room " + getRoom();
    }
}
