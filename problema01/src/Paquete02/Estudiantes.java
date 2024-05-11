/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

import java.util.Scanner;

/**
 *
 * @author toled
 */
public class Estudiantes {

    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    public Estudiantes(String n, double c1, double c2) {
        nombre = n;
        nota1 = c1;
        nota2 = c2;
        nota3 = (c1 + c2) / 2;
    }

    public Estudiantes(String n, double c1, double c2, double c3) {
        nombre = n;
        nota1 = c1;
        nota2 = c2;
        nota3 = c3;
    }

    public void establecernombreEstudiante(String n) {
        nombre = n;
    }

    public void establecerCalificacion1(double n1) {
        nota1 = n1;
    }

    public void establecerCalificacion2(double n2) {
        nota2 = n2;
    }

    public void establecerCalificacion3(double n3) {
        nota3 = n3;
    }

    public void establecerPromedio() {

        promedio = nota1 + nota2 + nota3;
        promedio = promedio / 3;
    }

    public String obtenernombreEstudiantes() {
        return nombre;
    }

    public double obtnerNota1() {
        return nota1;
    }

    public double obtnerNota2() {
        return nota2;
    }

    public double obtnernota3() {
        return nota3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return String.format("Calificaciones Estudiantes\n"
                + "Nombre del Estudiante: %s\n"
                + "Nota 1: %.2f\n"
                + "Nota 2: %.2f\n"
                + "Nota 3: %.2f\n"
                + "PromedIO: %.2f\n"
                + "\n",
                obtenernombreEstudiantes(),
                 obtnerNota1(),
                 obtnerNota2(),
                 obtnernota3(),
                obtenerPromedio());

    }
}
