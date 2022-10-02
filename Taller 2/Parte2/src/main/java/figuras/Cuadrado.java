package figuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Cuadrado {
    public double lado;
    public double area(){
        double area = lado * lado;
        return area;
    }

    public double perimetro(){
        double perimetro = (4*lado);
        return perimetro;
    }
}
