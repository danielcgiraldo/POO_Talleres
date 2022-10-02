/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap3propuesto18;

/**
 *
 * @author danie
 */
public class Empleado {
    String codigo, nombres;
    double num_horas, valor_horas, retefuente, bruto;
    public double getBruto() {
        bruto = valor_horas * num_horas;
        return bruto;
    }
    public double getNeto() {
        return bruto * (1 - retefuente/100);
    }
}
