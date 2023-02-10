package com.aitu.data;

import com.aitu.data.interfaces.IDB;

import java.sql.*;

public class PostgresDB implements IDB {

    @Override
    public Connection connect() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" +
                    "dormitory", "postgres", "cppsenku");
            if (connection != null) {
                System.out.println("Connection established");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }


}
