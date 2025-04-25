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


    }
}