package com.aitu;

public class Employee extends Person{

    private double salary;
    private double bonus;

    public Employee(String firstName, String lastName, int age, int id,
                    double salary, double bonus) {
        super(firstName, lastName, age, id);
        this.salary = salary;
        this.bonus = bonus;
    }



}
