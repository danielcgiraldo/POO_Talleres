/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Cap4Propuesto40;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Operaciones {

    String grupo;
    String[] lista;

    public void genLista() {
        lista = grupo.split(",");
    }

    public String raiz() {
        try {
            String a = "";
            for (String lista1 : lista) {
                a += String.valueOf(Math.sqrt(Double.parseDouble(lista1))) + ",";
            }
            return removelast(a);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ten cuidado con los datos ingresados. Algun(os) no tienen el tipo de dato correcto.",
                    "Datos Incorrectos",
                    JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }

    public String cuadrado() {
        try {
            String a = "";
            for (String lista1 : lista) {
                a += String.valueOf(Math.pow(Double.parseDouble(lista1), 2)) + ",";
            }
            return removelast(a);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ten cuidado con los datos ingresados. Algun(os) no tienen el tipo de dato correcto.",
                    "Datos Incorrectos",
                    JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }

    public String cubo() {
        try {
            String a = "";
            for (String lista1 : lista) {
                a += String.valueOf(Math.pow(Double.parseDouble(lista1), 3)) + ",";
            }
            return removelast(a);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Ten cuidado con los datos ingresados. Algun(os) no tienen el tipo de dato correcto.",
                    "Datos Incorrectos",
                    JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }

    private String removelast(String a) {
        StringBuilder sb = new StringBuilder(a);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
