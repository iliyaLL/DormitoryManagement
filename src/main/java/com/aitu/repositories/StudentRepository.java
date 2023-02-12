package com.aitu.repositories;

import com.aitu.data.interfaces.IDB;
import com.aitu.entities.Student;
import com.aitu.exceptions.UserExistsException;

import java.sql.*;
import java.util.*;

public class StudentRepository implements IStudentRepository {


    private final IDB db;

    public StudentRepository(IDB db) {
        this.db = db;
    }

    @Override
    public boolean addStudent(Student student) {
        Connection connection = null;
        try {
            connection = db.connect();
            String sql = "INSERT INTO students(age, first_name, last_name, floor, room) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, student.getAge());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setInt(4, student.getFloor());
            statement.setInt(5, student.getRoom());

            statement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Student getStudent(int id) {
        Connection connection = null;
        try {
            connection = db.connect();
            String sql = "SELECT id,first_name, last_name,age,floor,room FROM students WHERE id=?";
            PreparedStatement st = connection.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Student student = new Student(rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("age"),
                        rs.getInt("floor"),
                        rs.getInt("room"));

                return student;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (UserExistsException e) {
            System.out.println(e);;
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        Connection connection = null;
        try {
            connection = db.connect();
            String sql = "SELECT id,first_name,last_name, age, floor, room FROM students";
            Statement st = connection.createStatement();

            ResultSet rs = st.executeQuery(sql);
            ArrayList<Student> students = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student(rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("age"),
                        rs.getInt("floor"),
                        rs.getInt("room"));

                students.add(student);
            }

            return students;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (UserExistsException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
