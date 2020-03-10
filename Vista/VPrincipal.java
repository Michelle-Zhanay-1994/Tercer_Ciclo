/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.OyenteVPrincipal;
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
public class VPrincipal {

    JFrame f = new JFrame();
    JMenuBar menu = new JMenuBar();
    JMenu menu1;
  private JMenuItem miCrear, miAleatorio, miSalir;

    public JMenuItem getMiCrear() {
        return miCrear;
    }

    public void setMiCrear(JMenuItem miCrear) {
        this.miCrear = miCrear;
    }

    public JMenuItem getMiAleatorio() {
        return miAleatorio;
    }

    public void setMiAleatorio(JMenuItem miAleatorio) {
        this.miAleatorio = miAleatorio;
    }

    public JMenuItem getMiSalir() {
        return miSalir;
    }

    public void setMiSalir(JMenuItem miSalir) {
        this.miSalir = miSalir;
    }
  

    public VPrincipal() {
        f.setTitle("Ventana Principal");
        f.setSize(500, 450);
        f.setLocation(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
        f.setVisible(true);
    }

    public void iniciarComponentes() {
        f.setJMenuBar(menu);
        menu1 = new JMenu("Alumnos");
        menu.add(menu1);

        miCrear = new JMenuItem("Crear Alumnos");
        miCrear.addActionListener(new OyenteVPrincipal(this));
        menu1.add(miCrear);

        miAleatorio = new JMenuItem("Aleatorio Alumnos");
        miAleatorio.addActionListener(new OyenteVPrincipal(this));
        menu1.add(miAleatorio);

        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(new OyenteVPrincipal(this));
        menu1.add(miSalir);
    }
     private class Oyenteventanap implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            
            if (e.getSource() == miSalir) {
                System.exit(0);

            }
            if (e.getSource() == miCrear) {
                VCrearAlumnos p =new VCrearAlumnos();

            }
             if (e.getSource() == miAleatorio) {
                VAleatorioAlumnos i = new VAleatorioAlumnos();

            }

        }

    }
    
}

