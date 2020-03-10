
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.VCrearAlumnos;
import Vista.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearAlumno implements ActionListener {
    VCrearAlumnos vp;
    AlumnoBD abd;
    Alumno a;
    
    public OyenteCrearAlumno(VCrearAlumnos vp){
        this.vp = vp;
    }
    public void actionPerformed (ActionEvent ae){
        abd = new AlumnoBD();
        a=vp.guardarAlumno();
        abd.guardarAlumnoBD(a);
       vp.deshabilitar();
        
        
    }
}
