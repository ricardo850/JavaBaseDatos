package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe tu nombre:");

        String NombreApellido = teclado.nextLine();
        teclado = new Scanner(System.in);

        System.out.println("escribe tu cedula:");
        int cedula = teclado.nextInt();

        MetodoUsuario MetodosBaseDatos = new MetodoUsuario();
        MetodosBaseDatos.IngresarDatos(NombreApellido,cedula);


        System.out.println("escribe el numero de la cedula del registro que deseas actualizar:");

        System.out.println("escribe la cedula:");
        int cedulaBuscar = teclado.nextInt();

        teclado = new Scanner(System.in);
        System.out.println("Ahora escribe el nombre y apellidos nuevos:");
        String NombreApellidoActualizar = teclado.nextLine();

        teclado = new Scanner(System.in);
        System.out.println("escribe el numero de cedula nuevo:");
        int cedulaActualizar = teclado.nextInt();

        MetodosBaseDatos.ActualizarDatos(cedulaBuscar,NombreApellidoActualizar,cedulaActualizar);

    }
}