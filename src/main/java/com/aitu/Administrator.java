package com.aitu;

public class Administrator extends Employee implements IControl{

    public Administrator(String firstName, String lastName, int age,
                         double salary, double bonus) {
        super(firstName, lastName, age, salary, bonus);
    }

    public void increaseComplaints(Student student) {
        student.setNumberOfComplaints(student.getNumberOfComplaints() + 1);
    }

    public void decreaseComplaints(Student student) {
        student.setNumberOfComplaints(student.getNumberOfComplaints() - 1);
    }

    @Override
    public void addStudent(Student student, Dormitory block, int floor, int room) {
        if(room > 126 || room < 1) {
            throw new IllegalArgumentException("int room can from 1 to 126");
        }
        int roomLower = (floor - 1) * 18 + 1;
        int roomUpper = floor * 18;
        if(room < roomLower || room > roomUpper) {
            throw new IllegalArgumentException("the floor doesn't match the room");
        }

        block.addStudent(student, block, floor, room);
    }

    @Override
    public void removeStudent(Student student, Dormitory block) {
        block.removeStudent(student, block);
        System.out.println(student.getFirstName() + " was removed");
    }

    public void checkComplaints(Student student, Dormitory block) {
        if (student.getNumberOfComplaints() == 2) {
            removeStudent(student, block);
            System.out.println(student.getFirstName() + " was removed");
        } else {
            System.out.println(student);
        }
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I am an administrator");
    }
}
