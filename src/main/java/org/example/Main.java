package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("elija un numero " +
                "1. para agregar un registro " +
                "2. para actualizar un  regristro " +
                        "3. para actualizar un registro "+
                        "4. para ver los usuarios de registro : "
                   );

        int Eleccion = teclado.nextInt();
        teclado = new Scanner(System.in);
        MetodoUsuario MetodosBaseDatos = new MetodoUsuario();

        switch (Eleccion){
            case 1:
                System.out.println("escribe tu nombre:");

                String NombreApellido = teclado.nextLine();
                teclado = new Scanner(System.in);

                System.out.println("escribe tu cedula:");
                int cedula = teclado.nextInt();


                MetodosBaseDatos.IngresarDatos(NombreApellido,cedula);
                break;

            case 2:
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
                break;

            case 3:
                System.out.println("escribe la cedula del dato que vas a eliminar");
                int cedulaEliminar = teclado.nextInt();
                MetodosBaseDatos.EliminarDatos(cedulaEliminar);
                break;


            case 4:
                ArrayList<Usuario> ListaUser = MetodosBaseDatos.TraerDatos();

                for (Usuario usuario : ListaUser) {
                    System.out.println(usuario.toString());
                }
                break;


        }









    }
}