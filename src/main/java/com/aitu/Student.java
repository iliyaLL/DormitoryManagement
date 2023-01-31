package com.aitu;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{

    private int floor;
    private int room;
    private int numberOfComplaints = 0;
    private int id;
    private static ArrayList<Integer> id_gen = new ArrayList<>();
    private static int i = 0;
    private Scanner sc = new Scanner(System.in);

    public Student(String firstName, String lastName,
                   int age, int id) throws UserExistsException {
        super(firstName, lastName, age);

        try {
            setId(id);
        } catch (UserExistsException e) {
            System.out.println(e.getMessage());

            while(true) {
                System.out.print("another id: ");
                int newId = sc.nextInt();
                if(!studentExists(newId)) {
                    setId(newId);
                    break;
                }
            }

            System.out.println(id_gen);
        } catch (Exception e) {
            System.out.println("OK");
        }
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

    public void setId(int id)
            throws UserExistsException {
        if(studentExists(id)) {
            throw new UserExistsException(getFirstName() + getLastName() + " id already exists");
        } else {
            id_gen.add(id);
            i++;
            this.id = id;
        }
    }

    public void setFloorRoom(int floor, int room) {
        this.room = room;
        this.floor = floor;
    }

    public void setNumberOfComplaints(int numberOfComplaints) {
        this.numberOfComplaints = numberOfComplaints;
    }

    private boolean studentExists(int id) {
        for(int i: id_gen) {
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
        return getFirstName() + " " + getLastName() + ", floor "
                + getFloor() + ", room " + getRoom()
                + ", complaints: " + numberOfComplaints;
    }

}
