package Vista;

import Controlador.OyenteCrearAlumno;
import Controlador.OyenteVPrincipal;
import Controlador.OyenteVerificar;
import Modelo.Alumno;
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

public class VCrearAlumnos extends JFrame {

    JPanel p = new JPanel();
    JLabel ced = new JLabel("Cédula");
    JTextField ced1 = new JTextField(15);
    JLabel nom = new JLabel("Nombres");
    JTextField nom1 = new JTextField(15);
    JLabel ape = new JLabel("Apellidos");
    JTextField ape1 = new JTextField(15);
    JLabel direc = new JLabel("Dirección");
    JTextField direc1 = new JTextField(15);
    JLabel tel = new JLabel("Teléfono");
    JTextField tel1 = new JTextField(15);
    JLabel corr = new JLabel("Correo");
    JTextField corr1 = new JTextField(15);
    JLabel carre = new JLabel("Carrera");
    JTextField carre1 = new JTextField(15);
    JLabel mod = new JLabel("Modulo");
    JTextField mod1 = new JTextField(15);
    JButton crear = new JButton("Crear");
    JButton cerr = new JButton("Cerrar");
    JButton ver = new JButton("Verificar");
    private Alumno alumno = new Alumno();

    public VCrearAlumnos() {
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
        gb.insets = new Insets(10, 10, 10, 10);
        p.add(ced, gb);
        gb.gridx = 0;
        gb.gridy = 1;
        p.add(nom, gb);
        gb.gridx = 0;
        gb.gridy = 2;
        p.add(ape, gb);
        gb.gridx = 1;
        gb.gridy = 0;
        p.add(ced1, gb);
        gb.gridx = 1;
        gb.gridy = 1;
        p.add(nom1, gb);
        
        gb.gridx = 1;
        gb.gridy = 2;
        p.add(ape1, gb);
        
        gb.gridx = 0;
        gb.gridy = 5;
        p.add(direc, gb);
        gb.gridx = 1;
        gb.gridy = 5;
        p.add(direc1, gb);
        
        gb.gridx = 0;
        gb.gridy = 7;
        p.add(tel, gb);
        gb.gridx = 1;
        gb.gridy = 7;
        p.add(tel1, gb);
        
        gb.gridx = 0;
        gb.gridy = 9;
        p.add(carre, gb);
        gb.gridx = 1;
        gb.gridy = 9;
        p.add(carre1, gb);
        
        gb.gridx = 0;
        gb.gridy = 11;
        p.add(mod, gb);
        gb.gridx = 1;
        gb.gridy = 11;
        p.add(mod1, gb);
       
        gb.gridx = 0;
        gb.gridy = 13;
        p.add(corr, gb);
        gb.gridx = 1;
        gb.gridy = 13;
        p.add(corr1, gb);
       
        gb.gridx = 0;
        gb.gridy = 15;
        p.add(crear, gb);
        gb.gridx = 1;
        gb.gridy = 15;
        p.add(cerr, gb);
        gb.gridx = 0;
        gb.gridy = 17;
        gb.gridx = 2;
        gb.gridy = 0;
        p.add(ver,gb);
deshabilitar();
        crear.addActionListener(new OyenteCrearAlumno(this));
        cerr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });
        ver.addActionListener(new OyenteVerificar(this));
    }

    public Alumno guardarAlumno() {
        alumno = new Alumno();
        alumno.setCedula(ced1.getText());
        alumno.setNombre(nom1.getText());
        alumno.setApellido(ape1.getText());
        alumno.setDireccion(direc1.getText());
        alumno.setTeléfono(tel1.getText());
        alumno.setCorreo(corr.getText());
        alumno.setCarrera(carre1.getText());
        alumno.setModulo(mod1.getText());
        return alumno;
    }
     public Alumno BuscarAlumno() {
        alumno.setCedula(ced1.getText());
        return alumno;
    }
public void limpiarCampos() {

        ced1.setText("");
        nom1.setText("");
        ape1.setText("");
        direc1.setText("");
        tel1.setText("");
        corr1.setText("");
        mod1.setText("");
    }
public void habilitar (){
ced1.setEditable(true);
nom1.setEditable(true);
ape1.setEditable(true);
direc1.setEditable(true);
tel1.setEditable(true);
corr1.setEditable(true);
mod1.setEditable(true);
crear.setEnabled(true);
carre1.setEditable(true);


}
public void deshabilitar (){
carre1.setEditable(false);
nom1.setEditable(false);
ape1.setEditable(false);
direc1.setEditable(false);
tel1.setEditable(false);
corr1.setEditable(false);
mod1.setEditable(false);
crear.setEnabled(false);


}
public String verificaralumno(){
return ced1.getText();
}
}
