/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author danie
 */
public class Rectangulo {
    public double base, altura;

    public double area(){
        double area = base * altura;
        return area;
    }
    public double perimetro(){
        double perimetro = (2*base) + (2*altura);
        return perimetro;
    }
}
