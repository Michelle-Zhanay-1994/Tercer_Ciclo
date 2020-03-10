/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class VAleatorioAlumnos {
    JFrame v = new JFrame("Ventana de nombres aleatorios");
    String[] nombres = {"Martha", "Jose", "Samantha", "Felipe", "Valentina", "Amelia", "Luis", "Salome", "Emilio", "Franco", "Antonio", "Barbarita", "Carlos", "Rocio", "Paola", "Javier"};
    String[] lis;
    JPanel panel;
    JList nombre;
    JList seleccionados;
    JTextField texto;
    JButton boton;
    JTextArea n;
    Vector vec;
    ArrayList ganadorTitular;

    public VAleatorioAlumnos() {
        v.setSize(500, 500);
        v.setVisible(true);
        v.setBackground(Color.red);
//        v.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pantalla();

    }

    public void pantalla() {
        ubicar();
        lista();
        boton();
        texto();

    }

    public void ubicar() {

        panel = new JPanel();
        panel.setLayout(null);
        v.add(panel);

    }

    public void lista() {

        nombre = new JList(nombres);
        nombre.setBounds(100, 100, 100, 355);

        nombre.setForeground(green);
        panel.add(nombre);
        seleccionados = new JList();
        seleccionados.setBounds(400, 100, 100, 355);
        panel.add(seleccionados);

    }

    public void boton() {

        boton = new JButton("JUGAR");
        boton.setBounds(220, 200, 100, 30);
        panel.add(boton);
        boton.addActionListener((ActionEvent ae) -> {
            seleccion();

        });

    }

    public void texto() {
        n = new JTextArea();
        n.setBounds(220, 150, 50, 30);
        panel.add(n);

    }

    public void seleccion() {
        ganadorTitular = new ArrayList();
        int total = 0;
        try {
            total = Integer.parseInt(n.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(n, "Ingrese un numero");
        }
        DefaultListModel listModel = new DefaultListModel();
        int ganador = 0;
        Random sorteo = new Random();
        for (int i = 0; i < total; i++) {
            ganador = sorteo.nextInt(nombres.length);
            nombre.setSelectedIndex(ganador);
            nombre.setSelectionBackground(blue);
            ganadorTitular.add(nombres[ganador]);
            listModel.add(i, ganadorTitular.get(i));
            seleccionados.setModel(listModel);

        }

    }

    public static void main(String[] args) {
        new VAleatorioAlumnos();
    }
}
