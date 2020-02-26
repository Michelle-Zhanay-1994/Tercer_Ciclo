/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author LENOVO
 */
public class ventana_principal extends JFrame{
    
    JMenuBar menu = new JMenuBar ();
    JMenu menu1;
    JMenuItem miCrear,miAletorio,miSalir;
    public ventana_principal (){
        setTitle ("Ventana Principal");
        setSize (500,450);
        setLocation (200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
        setVisible(true);
    }
    public void iniciarComponentes(){
        setJMenuBar(menu);
        menu1 = new JMenu ("Alumnos");
        menu.add(menu1);
        
        miCrear = new JMenuItem("Crear Estudiantes");
        miCrear.addActionListener(new Oyenteventana_principal());
        menu1.add(miCrear);
        
        miAletorio = new JMenuItem("Aletorio");
        miAletorio.addActionListener(new Oyenteventana_principal());
        menu1.add(miAletorio);
        
        miSalir= new JMenuItem ("Salir");
        miSalir.addActionListener(new Oyenteventana_principal());
        menu1.add(miSalir);
    }
    public class Oyenteventana_principal implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==miSalir){
                System.exit(0);
            }
            if(ae.getSource()==miCrear){
                
                new Formulario ();
            }
            if(ae.getSource()==miAletorio){
                
                new Nombre_aleatorio();
            }
        }
}
    public static void main(String[] args) {
        ventana_principal obj = new  ventana_principal ();
    }
}
