/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import Paquete02.Estudiantes;

/**
 *
 * @author toled
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre;
        double n1;
        double n2;
        double n3;
        boolean bandera = true;

        System.out.printf("Cuantas materias decias calcular el promedio\n"
                + "(1)Promedio de 2 materias\n"
                + "(2)Promedio de 3 materias");

        opcion = entrada.nextInt();
        do {

            switch (opcion) {
                case 1 -> {
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese la primera nota");
                    n1 = entrada.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    n2 = entrada.nextInt();

                    Estudiantes estudiante1 = new Estudiantes(nombre, n1, n2);
                    estudiante1.establecerPromedio();

                    System.out.printf("%s\n", estudiante1);
                }
                case 2 -> {
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del estudiante");
                    nombre = entrada.nextLine();

                    System.out.println("Ingrese la nota1");
                    n1 = entrada.nextInt();

                    System.out.println("Ingrese la nota2");
                    n2 = entrada.nextInt();

                    System.out.println("Ingrese la nota3");
                    n3 = entrada.nextInt();

                    Estudiantes estudiante2 = new Estudiantes(nombre, n1, n2, n3);
                    estudiante2.establecerPromedio();
                    System.out.printf("%s\n", estudiante2);
                    ;
                }

            }
            entrada.nextLine();
            System.out.println("Desea ingresar mas estudiantes? Ingrese s para"
                    + " ingresar otro o n para salir");
            String respuesta = entrada.nextLine();
            bandera = respuesta.equals("s");
        } while (bandera);
    }

}
