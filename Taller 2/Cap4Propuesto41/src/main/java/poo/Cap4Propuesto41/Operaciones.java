/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Cap4Propuesto41;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Operaciones {

    String grupo;
    double mayor;

    public String genMayor() {
        try {
            String[] p = grupo.split(",");
            for (String lista1 : p) {
                if (Double.parseDouble(lista1) > mayor) {
                    mayor = Double.parseDouble(lista1);
                }
            }
            return String.valueOf(mayor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ten cuidado con los datos ingresados. Algun(os) no tienen el tipo de dato correcto.",
                    "Datos Incorrectos",
                    JOptionPane.ERROR_MESSAGE);
            return "";
        }

    }

}
