// The AITU Dormitory building plan.

package com.aitu;

import java.util.ArrayList;

public class Dormitory implements IControl{

    private final int numberOfFloors = 7;
    private final int roomsPerFloor = 18;
    private final int totalNumberOfRooms = 126;
    private int NumberOfEmptyRooms = 126;
    private ArrayList<Student> studentRooms = new ArrayList<>();

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getEmptyPlaces() {
        return NumberOfEmptyRooms;
    }

    public int getTotalNumberOfPlaces() {
        return totalNumberOfRooms;
    }

    public void info() {
        System.out.println(studentRooms);
    }

    public void info(int floor) {
        if(floor > 7 || floor < 1) {
            throw new IllegalArgumentException("int flat can be from 0 to 7");
        }
        int roomLower = (floor - 1) * roomsPerFloor + 1;
        int roomUpper = floor * roomsPerFloor;

        for (Student n : studentRooms) {
            if(n.getRoom() >= roomLower && n.getRoom() <= roomUpper) {
                System.out.println(n);
            }
        }
    }

    @Override
    public void addStudent(Student student, Dormitory block, int floor, int room) {
        student.setRoom(room);
        student.setFloor(floor);
        studentRooms.add(student);
        NumberOfEmptyRooms--;
    }

    @Override
    public void removeStudent(Student student, Dormitory block) {
        studentRooms.remove(student);
        NumberOfEmptyRooms++;
    }

    @Override
    public String toString() {
        return "Empty places: " + NumberOfEmptyRooms;
    }
}
