package com.platzi.mensajes_app;

import java.sql.Connection;

public class Inicio {
    
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.connection()) {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}