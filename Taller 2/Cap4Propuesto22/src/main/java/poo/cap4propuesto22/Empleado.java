/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap4propuesto22;

/**
 *
 * @author danie
 */
public class Empleado {
    String nombre;
    double num_horas, salario;
    public double salario_mensual() {
        return salario * num_horas;
    }
}
