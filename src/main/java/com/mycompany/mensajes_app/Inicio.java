package com.mycompany.mensajes_app;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("-------------------------");
            System.out.println(" Aplicación de Mensajes");
            System.out.println(" 1. Crear Mensaje");
            System.out.println(" 2. Listar Mensaje");
            System.out.println(" 3. Eliminar Mensaje");
            System.out.println(" 4. Editar Mensaje");
            System.out.println(" 5. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensaje();
                    break;
                case 3:
                    MensajeService.borrarMensaje();
                    break;
                case 4:
                    MensajeService.actualizarMensaje();
                    break;
            }
        } while (option != 5);
    }
}
