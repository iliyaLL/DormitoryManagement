/*
DormitoryManagement
Assignment 3 IT-2208

Contributors: Iliya Lim, Islambek Nurzhanov, Sanzhar Zhagiparov, Amirzhan Issa

The program helps to manage the day-to-day affairs of the AITU Dormitory
 */

package com.aitu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
            throws UserExistsException, IllegalArgumentException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        Dormitory blockOne = new Dormitory();
        Dormitory blockTwo = new Dormitory();
        Dormitory blockThree = new Dormitory();
        Administrator admin = new Administrator("Temirlam", "Zhakhsalykov", 25, 1500, 50);

        Student student = new Student("Zhan", "Bulatov", 18);
        Student student1 = new Student("Iliya", "Lim", 18);
        Student student2 = new Student("Sanzhar", "Zhagiparov", 17);
        Student student3 = new Student("Islambek", "Nurzhanov", 21);
        Student student4 = new Student("Amirzhan", "Issa", 19);

        admin.addStudent(student,blockOne,1, 1);
        admin.addStudent(student1,blockOne,1, 2);
        admin.addStudent(student2,blockOne,1, 3);
        admin.addStudent(student3,blockOne,1, 4);
        admin.addStudent(student4,blockOne,1, 5);

        blockOne.info();

    }
}