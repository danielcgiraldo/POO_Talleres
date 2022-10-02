/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap4resuelto7;

/**
 *
 * @author danie
 */
public class Numeros {
    double A, B;
    public String check() {
        if(A > B) return "A es MAYOR que B.";
        else if (A < B) return "A es MENOR que B.";
        else return "A es IGUAL a B.";
    }
}
