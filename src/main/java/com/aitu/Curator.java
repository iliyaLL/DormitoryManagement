package com.aitu;

public class Curator extends Employee{

    public Curator(String firstName, String lastName, int age,
                   double salary, double bonus) {
        super(firstName, lastName, age, salary, bonus);
    }


    public void fileComplaint(Student student, Administrator admin) {
        admin.increaseComplaints(student);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I am a curator");
    }
}
