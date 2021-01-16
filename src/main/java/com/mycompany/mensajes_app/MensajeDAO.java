package com.mycompany.mensajes_app;

import java.sql.*;

public class MensajeDAO {
    public static void crearMensajeDB(Mensaje mensaje){
        Conexion db_connect = new Conexion();
        
        try(Connection conection = db_connect.get_conection()) {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                ps = conection.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje Creado Correctamente");
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void leerMensajeDB(){
        
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
        
    }
}
