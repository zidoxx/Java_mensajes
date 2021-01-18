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
        MensajeDAO.leerMensajeDB();
    }
    
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id a borrar: ");
        int id_mensaje = sc.nextInt();
        MensajeDAO.borrarMensajeDB(id_mensaje);
    }
    
    public static void actualizarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del Mensaje a actualizar: ");
        int id_mensaje = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese su mensaje: ");
        String mensaje = sc.nextLine();
        System.out.println("Ingrese el Autor: ");
        String autor = sc.nextLine();
        Mensaje registro = new Mensaje();
        registro.setId_mensaje(id_mensaje);
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autor);
        MensajeDAO.actualizarMensajeDB(registro);
    }
}
