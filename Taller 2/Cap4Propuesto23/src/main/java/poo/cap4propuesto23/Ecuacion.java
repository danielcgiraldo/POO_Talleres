/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap4propuesto23;

/**
 *
 * @author danie
 */
public class Ecuacion {
    double A,B,C;
    public double getDiscriminante(){
        return Math.pow(B, 2) - 4*A*C;
    }
    public double getOne() {
        return -B / 2*A;
    }
    public double getSecondPart() {
        return getDiscriminante()/(2*A);
    }
}
