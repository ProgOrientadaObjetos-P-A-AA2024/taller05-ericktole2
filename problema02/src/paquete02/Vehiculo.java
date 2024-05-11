/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author toled
 */
public class Vehiculo {

    private String marca;
    private double valorMatricula;
    private double valorAuto;
    private String cedula;
    private int ano;

    public Vehiculo(String c, String m, int a, double v) {
        cedula = c;
        marca = m;
        ano = a;
        valorAuto = v;

    }

    public void establecercedula(String ce) {
        cedula = ce;
    }

    public void estableceryear(int a) {
        ano = a;
    }

    public void establecermarca(String m) {
        marca = m;
    }

    public void establecervalorAuto(double v) {
        valorAuto = v;
    }

    public void establecerValorMatricula() {
       valorMatricula = valorAuto * 0.002;
       valorMatricula = valorMatricula + (2024 - ano);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerYear() {
        return ano;
    }

    public double obtenervalorAuto() {
        return valorAuto;
    }

    public double obtenervalorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        return String.format("Informe Del Vehiculo \n"
                + "Cedula del propietario: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor total de la matricula: %.2f\n"
                + "\n",
                obtenerCedula(), obtenerMarca(), obtenerYear(),
                obtenervalorAuto(), obtenervalorMatricula());

    }
}
