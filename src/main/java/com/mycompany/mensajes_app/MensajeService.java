package com.mycompany.mensajes_app;

import java.util.Scanner;

public class MensajeService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su mensaje: ");
        String mensaje = sc.nextLine();
        System.out.println("Ingrese el Autor: ");
        String autor = sc.nextLine();
        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autor);
        MensajeDAO.crearMensajeDB(registro);
    }
    
    public static void listarMensaje(){
        
    }
    
    public static void borrarMensaje(){
    
    }
    
    public static void actualizarMensaje(){
        
    }
}
