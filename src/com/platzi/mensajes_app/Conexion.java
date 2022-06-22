package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public Connection connection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/mensajes_app", "root", "");
            if(connection != null){
                System.out.println("Conexión establecida");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
