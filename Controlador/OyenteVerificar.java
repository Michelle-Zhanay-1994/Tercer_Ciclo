/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.VCrearAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
/**
 *
 * @author LENOVO
 */
public class OyenteVerificar implements ActionListener{
   
    VCrearAlumnos vp;
    AlumnoBD abd;
    Alumno a;
    public OyenteVerificar (VCrearAlumnos vp){
		this.vp = vp;
	}
    @Override

    public void actionPerformed(ActionEvent ae) {

        abd = new AlumnoBD();
        abd.buscar(vp.BuscarAlumno());
      
       
//        if (a.getCedula()== null){
//        vp.habilitar();
//        }else{vp.deshabilitar();}
        vp.limpiarCampos();
        vp.habilitar();
           
        
  
        
       
  

    }
    
    
}
