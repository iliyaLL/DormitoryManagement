package com.aitu.entities;

import com.aitu.exceptions.UserExistsException;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    private int block;
    private int floor;
    private int room;
    private int id;
    private static int id_gen = 1;
    private static ArrayList<Integer> ids = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Student(int id, String firstName, String lastName,
                   int age, int floor, int room) throws UserExistsException {
        super(firstName, lastName, age);
        setFloorRoom(floor, room);
        setId(id_gen);
    }

    public Student(String firstName, String lastName,
                   int age, int floor, int room) throws UserExistsException {
        super(firstName, lastName, age);
        setFloorRoom(floor, room);
        setId(id_gen);
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
        if(studentExists(id)) {
            throw new UserExistsException(getFirstName() + getLastName() + " id already exists");
        } else {
            ids.add(id);
            this.id = id;
            id_gen++;
        }
    }

    public void removeId(){
        ids.remove(Integer.valueOf(this.id));
    }

    public void setFloorRoom(int floor, int room) {
        this.room = room;
        this.floor = floor;
    }

    private boolean studentExists(int id) {
        for(int i: ids) {
            if(i == id) {
                return true;
            }
        }
        return false;
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
