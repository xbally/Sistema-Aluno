/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabri
 */
public class ConnectionFactory {
    
            public static Connection getConnection() {
        
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/a", "postgres", "root");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException (e);
        }
    }
}

