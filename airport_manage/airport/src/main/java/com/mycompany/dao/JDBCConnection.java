/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tomioka
 */
public class JDBCConnection {
    public static Connection getJDBCConnection() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airportdb", "root", "password");
            return cntn;
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
        return null;
    }
}
