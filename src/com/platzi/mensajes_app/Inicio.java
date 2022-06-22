package com.platzi.mensajes_app;

import java.util.Scanner;

public class Inicio {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------------------");
            System.out.println("Aplicación de Mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensaje");
            System.out.println("3. Eliminar Mensaje");
            System.out.println("4. Editar Mensaje");
            System.out.println("5. Salir");

            //Leemos la opción que nos da el usuario
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    mensajesService.crearMensaje();
                break;

                case 2:
                    mensajesService.listarMensaje();
                break;
                
                case 3:
                    mensajesService.borrarMensaje();
                break;
                
                case 4:
                    mensajesService.editarMensaje();
                break;
                
                default:
                break;
            }


        } while (opcion != 5);
    }
}