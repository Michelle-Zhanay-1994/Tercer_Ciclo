
package practica_22_01_20;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana_principal extends JFrame{
    JPanel p = new JPanel ();
    JLabel a = new JLabel ("JUGUEMOS!! Escoje lo que quieres adivinar!");
    JButton b = new JButton ("Chequear");
    JTextField c = new JTextField (15);
  ventana_resultado q;
    JComboBox cb ;
    
    public ventana_principal(){
        super("Ventana Principal");
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        setVisible(true);
         pack();
    }
    public void agregarComponentes(){
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints ();
        g.gridx = 0;
        g.gridy = 0;
        g.insets =  new Insets (10,10,10,10);
        
        p.add(a,g);
        g.gridy = 1;
        p.add(c,g);
        Vector v = new Vector(4);
        v.addElement("Numero de la semana");
        v.addElement("Dia del año");
        v.addElement("Dia del mes");
        v.addElement("Año");
        v.addElement("Semana del mes");
       cb = new JComboBox (v);
        g.gridx =1;
        p.add(cb,g);
        g.gridy = 2;
        g.gridx =0;
        p.add(b,g);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //ventana_resultado vr = new ventana_resultado ();
                if(!c.getText().isEmpty()){
                    Combobox();
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Inserte texto para empezar a jugar");
                }
            
            }
        });
        
    }

    public void Combobox ( ){
        switch (cb.getSelectedIndex()) {
            case 0:
                 try{
                 int text = Integer.parseInt(c.getText());
                 Calendar cal = Calendar.getInstance();
                  int ca=cal.get(Calendar.WEEK_OF_YEAR);
                 
                  if(text==ca){
                       q = new ventana_resultado ();
                      q.ar.setText("Correcto");
                      q.ar.setForeground(Color.green);
                      q.br.setText("Terminar");
                     
                  }else{
                      q = new ventana_resultado ();
                      q.ar.setText("Incorrecto");
                      q.ar.setForeground(Color.red);
                      q.br.setText("Trata de nuevo");
                  }
       }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingresar un numero para jugar");
        } break;
            case 1:
            try{
                 int text = Integer.parseInt(c.getText());
                 Calendar cal = Calendar.getInstance();
               int ca=cal.get(Calendar.DAY_OF_YEAR);
                 
                  if(text==ca){
                       q = new ventana_resultado ();
                      q.ar.setText("Correcto");
                      q.ar.setForeground(Color.green);
                      q.br.setText("Terminar");
                     
                  }else{
                      q = new ventana_resultado ();
                      q.ar.setText("Incorrecto");
                      q.ar.setForeground(Color.red);
                      q.br.setText("Trata de nuevo");
                  }
  
     }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingresar un numero para jugar");
        }break;
            case 2:
                try{
                 int text = Integer.parseInt(c.getText());
                 Calendar cal = Calendar.getInstance();
               int ca=cal.get(Calendar.DAY_OF_MONTH);
                 
                  if(text==ca){
                       q = new ventana_resultado ();
                      q.ar.setText("Correcto");
                      q.ar.setForeground(Color.green);
                      q.br.setText("Terminar");
                     
                  }else{
                      q = new ventana_resultado ();
                      q.ar.setText("Incorrecto");
                      q.ar.setForeground(Color.red);
                      q.br.setText("Trata de nuevo");
                  }
  
     }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingresar un numero para jugar");
    }    break;
            case 3:
                try{
                 int text = Integer.parseInt(c.getText());
                 Calendar cal = Calendar.getInstance();
               int ca=cal.get(Calendar.YEAR);
                 
                  if(text==ca){
                       q = new ventana_resultado ();
                      q.ar.setText("Correcto");
                      q.ar.setForeground(Color.green);
                      q.br.setText("Terminar");
                     
                  }else{
                      q = new ventana_resultado ();
                      q.ar.setText("Incorrecto");
                      q.ar.setForeground(Color.red);
                      q.br.setText("Trata de nuevo");
                  }
  
     }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingresar un numero para jugar");
    }break;
            case 4:
                try{
                 int text = Integer.parseInt(c.getText());
                 Calendar cal = Calendar.getInstance();
               int ca=cal.get(Calendar.WEEK_OF_MONTH);
                 
                  if(text==ca){
                       q = new ventana_resultado ();
                      q.ar.setText("Correcto");
                      q.ar.setForeground(Color.green);
                      q.br.setText("Terminar");
                     
                  }else{
                      q = new ventana_resultado ();
                      q.ar.setText("Incorrecto");
                      q.ar.setForeground(Color.red);
                      q.br.setText("Trata de nuevo");
                  }
  
     }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingresar un numero para jugar");
   } 
        
            
            
    }
}
}
    

