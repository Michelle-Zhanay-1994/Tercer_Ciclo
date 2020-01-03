/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joption;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class cadena {

    public static void main(String[] args) {
        char caracteres = 0;
        String cadena;
        String correo = "";
        char arroba = '@';
        int numero = 0;
        

        cadena = JOptionPane.showInputDialog("INGRESE SU CORREO ");

        for (int i = 0; i < cadena.length(); i++) {

            caracteres = cadena.charAt(i);

            correo = correo + caracteres;

            if (cadena.charAt(i) == arroba) {

                numero++;

            }

        }

        JOptionPane.showMessageDialog(null, numero);
    }
}
