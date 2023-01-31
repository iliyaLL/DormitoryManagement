/*
DormitoryManagement
Assignment 3 IT-2208

Contributors: Iliya Lim, Islambek Nurzhanov, Sanzhar Zhagiparov, Amirzhan Issa

The program helps to manage the day-to-day affairs of the AITU Dormitory
 */

package com.aitu;

public class Main {

    public static void main(String[] args)
            throws UserExistsException, IllegalArgumentException {

        Administrator admin = new Administrator("Serzhan", "Ossenov", 31, 1000, 0.1);
        Dormitory blockOne = new Dormitory();
        Curator curator = new Curator("Aizhan", "Apai", 35, 10000, 500);
        Student student0 = new Student("Iliya", "Lim", 17, 1);
        Student student1 = new Student("Amirzhan", "Issa", 18, 2);
        Student student2 = new Student("Sanzhar", "Zhagiparov", 19, 3);
        Student student3 = new Student("Islambek", "Nurbanov", 19, 4);

        admin.addStudent(student0, blockOne, 2, 19);
        blockOne.info();

        System.out.println("Hello");
    }
}