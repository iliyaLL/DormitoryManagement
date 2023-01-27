package com.aitu;

public class Curator extends Employee{

    private boolean fileComplaint = false;

    public Curator(String firstName, String lastName, int age, int id,
                   double salary, double bonus) {
        super(firstName, lastName, age, id, salary, bonus);
    }


    public void fileFileComplaint() {
        //the method send a complaint to the administrator
        //if a student has two complaints it gets kicked
    }

}
