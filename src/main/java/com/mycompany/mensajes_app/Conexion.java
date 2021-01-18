package com.mycompany.mensajes_app;

import java.sql.*;

public class Conexion {
    public Connection get_conection(){
        Connection conection = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC","root", "");
            if(conection == null){
                System.out.println("Error de Conexión");
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return conection;
    }
}
