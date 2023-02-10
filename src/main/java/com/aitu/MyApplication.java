package com.aitu;

import com.aitu.controllers.StudentController;
import com.aitu.entities.Dormitory;
import com.aitu.exceptions.UserExistsException;

import java.util.*;

public class MyApplication {

    private final Scanner scanner;
    private final StudentController controller;
    private Dormitory blockOne = new Dormitory();
    private Dormitory blockTwo = new Dormitory();
    private Dormitory blockThree = new Dormitory();


    public MyApplication(StudentController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("""
                
                Welcome to the Dormitory Management Application!
                Select the option:
                1. Get students by blocks
                2. Get the student by ID
                3. Add a student
                4. Remove the student
                0. exit
                
                """);

        try {
            System.out.print("Enter option (1-4): ");
            int option = scanner.nextInt();
            if (option == 1) {
                getAllStudentsMenu();
            } else if (option == 2) {
                getStudentByIdMenu();
            } else if (option == 3) {
                addStudentMenu();
            } else {
                System.out.println("terminating...");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be integer");
            scanner.nextLine(); // to ignore incorrect input
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("**************************************************");
    }


    public void getAllStudentsMenu() {
        String response = controller.getAllStudents();
        System.out.println(response);
    }

    public void getStudentByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getStudent(id);
        System.out.println(response);
    }

    public void addStudentMenu() throws UserExistsException {
        System.out.println("Please enter the name");
        String name = scanner.next();
        System.out.println("Please enter the surname");
        String surname = scanner.next();
        System.out.println("Please enter the age");
        int age = scanner.nextInt();
        System.out.println("Please enter the floor");
        int floor = scanner.nextInt();
        System.out.println("Please enter the room");
        int room = scanner.nextInt();

        String response = controller.addStudent(name, surname, age, floor, room);
        System.out.println(response);
    }
}
