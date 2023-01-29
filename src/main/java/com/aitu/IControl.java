package com.aitu;

public interface IControl {

    void addStudent(Student student, Dormitory block, int floor, int room);

    void removeStudent(Student student, Dormitory block);
}
