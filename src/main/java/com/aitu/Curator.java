package com.aitu;

public class Curator extends Person{

    private int salary;
    private int bonus;
    private boolean fileComplaint = false;

    public Curator(String firstName, String lastName, int age, int id, int salary, int bonus) {
        super(firstName, lastName, age, id);
        this.salary = salary;
        this.bonus = bonus;
    }


    public void fileFileComplaint() {
        //the method send a complaint to the administrator
        //if a student has two complaints it gets kicked
    }

}
