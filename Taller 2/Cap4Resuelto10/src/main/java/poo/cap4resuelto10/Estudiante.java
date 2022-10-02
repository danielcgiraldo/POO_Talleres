/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap4resuelto10;

/**
 *
 * @author danie
 */
public class Estudiante {
    String codigo, nombres;
    double patrimonio, estrato;
    public double pago() {
        if(patrimonio > 2000000 & estrato > 3) {
            return 50.000 + patrimonio * 0.03;
        } else return 50.000;
    }
}
