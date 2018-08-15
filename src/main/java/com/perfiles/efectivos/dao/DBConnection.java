package com.perfiles.efectivos.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public DBConnection(){

    }

    public void createConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3308/";
        String dbName = "database";
        String driver = "com.mysql.cj.jdbc.Driver";
        String userName = "root";
        String password = "bigboss_2801";

        try
        {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Connected to the database");
            conn.close();
            System.out.println("Disconnected from database");

        }
        catch (Exception e)
        {
            System.out.println("NO CONNECTION =(");
        }
    }
}
