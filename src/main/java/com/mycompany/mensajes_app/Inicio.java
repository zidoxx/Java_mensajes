package com.mycompany.mensajes_app;

import java.sql.*;

public class Inicio {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        try (Connection cnx = con.get_conection()) {

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
