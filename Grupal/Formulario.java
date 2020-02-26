/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class Formulario extends JFrame {

    JPanel p = new JPanel();
    JLabel ced = new JLabel("Cédula");
    JTextField ced1 = new JTextField(15);
    JLabel nom = new JLabel("Nombre");
    JTextField nom1 = new JTextField(15);
    JLabel ape = new JLabel("Apellido");
    JTextField ape1 = new JTextField(15);
    JLabel direc = new JLabel("Dirección");
    JTextField direc1 = new JTextField(15);
    JLabel tel = new JLabel("Teléfono");
    JTextField tel1 = new JTextField(15);
    JLabel corr = new JLabel("Correo");
    JTextField corr1 = new JTextField(15);
    JButton crear = new JButton("Crear");
    JButton cerr = new JButton("Cerrar");

    public Formulario() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        agregarComponentes();
        setVisible(true);
       
    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
     gb.gridx = 0;
        gb.gridy = 0;
        gb.insets= new Insets(10,10,10,10);
        p.add(ced,gb);
        gb.gridx=0;
        gb.gridy = 1;
        p.add(nom,gb);
        gb.gridx=0;
        gb.gridy=2;
        p.add(ape,gb);
        gb.gridx=1;
        gb.gridy=0;
        p.add(ced1,gb);
        gb.gridx=1;
        gb.gridy=1;
        p.add(nom1,gb);
        gb.gridx =1;
        gb.gridy =2;
        p.add(ape1,gb);
        gb.gridx=0;
        gb.gridy=5;
        p.add(direc,gb);
        gb.gridx=1;
        gb.gridy=5;
        p.add(direc1,gb);
        gb.gridx=0;
        gb.gridy=7;
        p.add(tel,gb);
        gb.gridx=1;
        gb.gridy=7;
        p.add(tel1,gb);
        gb.gridx=0;
        gb.gridy=9;
        p.add(corr,gb);
        gb.gridx = 1;
         gb.gridy=9;
         p.add(corr1,gb);
        gb.gridx = 0;
        gb.gridy = 11;
        p.add(crear,gb);
        gb.gridx = 1;
         gb.gridy=11;
         p.add(cerr,gb);
        gb.gridx = 0;
        gb.gridy = 13;
}
}
