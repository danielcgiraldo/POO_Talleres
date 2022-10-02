/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap3propuesto19;

/**
 *
 * @author danie
 */
public class Triangulo {
    double lado;
    public double getAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }
    public double getPerimetro() {
        return lado*3;
    }
    public double getArea() {
        return getAltura() * lado / 2;
    }
}
