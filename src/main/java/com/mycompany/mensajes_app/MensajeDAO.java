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
        Conexion db_connect = new Conexion();
        try(Connection conection = db_connect.get_conection()) {
            PreparedStatement ps = null;
            ResultSet rs= null;
            try{
                String query = "SELECT * FROM mensajes";
                ps = conection.prepareStatement(query);
                rs=ps.executeQuery();
                while(rs.next()){
                    System.out.println("ID: " + rs.getInt("id_mensaje"));
                    System.out.println("MENSAJE: " + rs.getString("mensaje"));
                    System.out.println("AUTOR: " + rs.getString("autor_mensaje"));
                    System.out.println("FECHA: " + rs.getString("fecha_mensaje"));
                    System.out.println("");
                }
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }catch(SQLException e){
                e.printStackTrace(System.out);
        }
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conection = db_connect.get_conection()) {
            try{
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                PreparedStatement ps = conection.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                int countRowsUpdated = ps.executeUpdate();
                if(countRowsUpdated != 0){
                    System.out.println("Mensaje Borrado Correctamente");
                }else{
                    System.out.println("Id no encontrado o no existe");
                }
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }catch(SQLException e){
                e.printStackTrace(System.out);
        }
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conection = db_connect.get_conection()) {
             try{
                String query = "UPDATE mensajes SET mensaje = ?, autor_mensaje = ? WHERE id_mensaje = ?";
                PreparedStatement ps = conection.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.setInt(3, mensaje.getId_mensaje());
                int countRowsUpdated = ps.executeUpdate();
                if(countRowsUpdated != 0){
                    System.out.println("Mensaje actualizado Correctamente");
                }else{
                    System.out.println("Id no encontrado o no existe");
                }
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }catch(SQLException e){
                e.printStackTrace(System.out);
        }
    }
}
