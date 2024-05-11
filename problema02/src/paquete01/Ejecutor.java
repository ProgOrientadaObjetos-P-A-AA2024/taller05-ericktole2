/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.Vehiculo;

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

        String ced;
        String marca;
        int year;
        double valor;

        boolean bandera = true;

        while (bandera) {
            int i = 1;
            System.out.println("Ingrese la cedula del propietario");
            ced = entrada.nextLine();
            System.out.println("Ingrese la marca del vehiculo");
            marca = entrada.nextLine();
            System.out.println("Ingrese ano de fabricaciin del vehiculo");
            year = entrada.nextInt();
            System.out.println("Ingrese el valor del vehiculo");
            valor = entrada.nextInt();

            Vehiculo v = new Vehiculo(ced, marca, year, valor);
            v.establecerValorMatricula();

            entrada.nextLine();
            System.out.println("¿Desea ingresar mas vehiculos? (s/n)");
            String respuesta = entrada.nextLine();
            bandera = respuesta.equals("s");

            System.out.printf("%s\n", v);
        }

    }

}
