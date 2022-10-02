/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author danie
 */
public class Triangulo {
    public double base, altura, hipotenusa;
    public double area(){
        double area = (base*altura)/2;
        return area;
    }

    public double perimetro(){
        double perimetro = hipotenusa + base + altura;
        return perimetro;
    }

    public double hipotenusa(){
        hipotenusa = Math.sqrt((altura*altura)+(base*base));
        return hipotenusa;
    }
    public String tipoTriangulo(){
    	if(hipotenusa == altura && altura == base) return "Equilátero";
    	else if(hipotenusa == altura || altura == base) return "Isóceles";
    	else return "Escaleno";
    }
}
