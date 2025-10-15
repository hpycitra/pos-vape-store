/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posproject;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class konek_database {
    private static Connection conn;
    
    public static Connection getConnection() {
        if (conn == null){
            try {
                String url = "jdbc:mysql://localhost:3306/vape-store";
                String user = "root";
                String pass = "";
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi ke db_login berhasil!");                
            } catch (SQLException e){
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}