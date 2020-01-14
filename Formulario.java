/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author LENOVO
 */
public class Formulario {

    public Formulario() {
        JFrame frame = new JFrame("FACEBOOK");
        JTextField texto = new JTextField();
        JLabel Label = new JLabel("Aqui va el texto");
        JPanel panel = new JPanel();
        JTextArea areaTexto = new JTextArea();

        frame.setSize(550, 700); 

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel(new GridBagLayout());
        frame.setContentPane(pane);

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel correo = new JLabel("Correo Electronico");
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 0;
        pane.add(correo, c);

        JLabel headerLabe2 = new JLabel("Contraseña");
        c.gridx = 1;
        c.gridwidth = 13;
        c.gridy = 0;

        pane.add(headerLabe2, c);

        JButton buttonC = new JButton("Entrar");
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 0;

        pane.add(buttonC, c);

        JLabel fecha = new JLabel("Fecha de nacimiento");
        c.gridx = 0;
        c.gridwidth = 12;
        c.gridy = 8;

        pane.add(fecha, c);

        JLabel sexo1 = new JLabel("Mujer");
        c.gridx = 0;
        c.gridwidth = 12;
        c.gridy = 10;

        pane.add(sexo1, c);

        JButton buttonA = new JButton("Registrate");
        c.gridx = 0;
        c.gridwidth = 10;
        c.gridy = 12;

        pane.add(buttonA, c);

        JLabel text = new JLabel("¿Has olvidado los datos de la cuenta?");
        c.gridx = 1;
        c.gridwidth = 13;
        c.gridy = 1;

        pane.add(text, c);

        JLabel sexo = new JLabel("Hombre");
        c.gridx = 1;
        c.gridwidth = 12;
        c.gridy = 10;

        pane.add(sexo, c);

        JButton buttonB = new JButton("Dia");
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 9;

        pane.add(buttonB, c);

        JButton button = new JButton("Mes");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 9;
        pane.add(button, c);
        JButton buttonD = new JButton("Año");
        c.gridx = 2;
        c.gridwidth = 12;
        c.gridy = 9;

        pane.add(buttonD, c);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Formulario objeto = new Formulario();
    }

}
