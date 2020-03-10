/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VAleatorioAlumnos;
import Vista.VCrearAlumnos;
import Vista.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LENOVO
 */
public class OyenteVPrincipal implements ActionListener{
VPrincipal vp;

    public OyenteVPrincipal(VPrincipal vp) {
        this.vp = vp;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==vp.getMiSalir()){
          System.exit(0);
      }
      if(ae.getSource()==vp.getMiAleatorio()){
          new VAleatorioAlumnos();
      }
      if(ae.getSource()==vp.getMiCrear()){
          new VCrearAlumnos();
      }
    }
    }
    

