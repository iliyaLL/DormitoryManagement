package com.aitu;

import java.util.ArrayList;
import java.util.Arrays;

public class AituDormitory implements IControl{

    private int numberOfFloors = 7;
    private int totalNumberOfRooms;
    private int emptyPlaces;
    private ArrayList<Student> studentRooms = new ArrayList<>();

    @Override
    public String toString() {
        return "Floors: " + numberOfFloors;
    }

    @Override
    public void add(Student student, int floor, int room) {
        //if room floor * room > totalNumberOfRooms throw an Exception
        room = floor * room;
        studentRooms.add(student);
    }

    @Override
    public void delete(Student student) {
        studentRooms.remove(student);
    }
}
