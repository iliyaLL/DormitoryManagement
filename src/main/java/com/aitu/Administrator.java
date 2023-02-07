package com.aitu;

public class Administrator extends Employee implements IControl {

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

    public void checkComplaints(Student student, Dormitory block) {
        if (student.getNumberOfComplaints() >= 2) {
            removeStudent(student, block);
        } else {
            System.out.println(student);
        }
    }

    @Override
    public void addStudent(Student student, Dormitory block, int floor, int room) {
        block.addStudent(student, block, floor, room);
        System.out.println(student.getFirstName() + " was added");
    }

    @Override
    public void removeStudent(Student student, Dormitory block) {
        block.removeStudent(student, block);
        System.out.println(student.getFirstName() + " was removed");
    }
}