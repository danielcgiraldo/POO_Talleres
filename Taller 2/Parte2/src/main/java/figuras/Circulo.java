/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author danie
 */
public class Circulo {
    public double radio;
    public double area(){
        double area = Math.PI*(radio*radio);
        return area;
    }

    public double perimetro(){
        double perimetro = Math.PI*2*radio;
        return perimetro;
    }
}
