package com.aitu;

public interface Control {

    void addStudent(Student student, Dormitory block, int floor, int room);

    void removeStudent(Student student, Dormitory block);
}
