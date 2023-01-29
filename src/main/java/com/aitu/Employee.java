package com.aitu;

public class Employee extends Person{

    private double salary;
    private double bonus;

    public Employee(String firstName, String lastName,
                    int age, double salary, double bonus) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I am an employee");
    }
}
