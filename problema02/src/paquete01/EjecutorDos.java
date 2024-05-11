/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.Vehiculo;

/**
 *
 * @author toled
 */
public class EjecutorDos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opc;
        String cedula;
        String marca;
        int ano;
        double valor;

        System.out.println("Cuantas matriculas desea ingresar?");
        opc = entrada.nextInt();
        for (int i = 0; i < opc; i++) {
            entrada.nextLine();
            System.out.println("Ingrese la cedula del propietario");
            cedula = entrada.nextLine();
            System.out.println("Ingrese la marca del vehiculo");
            marca = entrada.nextLine();
            System.out.println("Ingrese ano de fabricacion del vehiculo");
            ano = entrada.nextInt();
            System.out.println("Ingrese el valor del vehiculo");
            valor = entrada.nextInt();
            Vehiculo v = new Vehiculo(cedula, marca, ano, valor);
            v.establecerValorMatricula();
            System.out.printf("%s\n", v);

        }

    }

}
