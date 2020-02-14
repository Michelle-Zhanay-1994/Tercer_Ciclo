package grupalventanas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Grupalventanas {

    JFrame v = new JFrame("Ventanas multiples");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JLabel t = new JLabel();
    String[] musica = {"Bachata", "Baladas", "Salsa", "Rock", "Pop"};
    JList lista = new JList(musica);
    JScrollPane barra = new JScrollPane(lista);
    JTextArea ib = new JTextArea();
    JTextArea infobach = new JTextArea();
    JTextArea infobal = new JTextArea();
    JTextArea infosal = new JTextArea();
    JTextArea inforoc = new JTextArea();
    JTextArea infopop = new JTextArea();

    public Grupalventanas() {

//aparece en la mitad la ventana
        v.setLocationRelativeTo(null);
    v.setSize(600,600);
//        v.pack();

        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lista.setVisible(true);
        v.setVisible(true);
        agregarComponentes();
//        v.pack();
       
       

    }

    public void agregarComponentes() {

        v.getContentPane().add(panel1);
        v.getContentPane().add(panel2);
        v.getContentPane().add(panel3);
        v.getContentPane().add(panel4);

        panel2.setLayout(new GridBagLayout());

        GridBagConstraints g1 = new GridBagConstraints();
        GridBagConstraints g2 = new GridBagConstraints();
        GridBagConstraints g3 = new GridBagConstraints();
//        panel1.setBackground(Color.green);
        panel2.setBackground(Color.red);
        v.getContentPane().add(panel1);
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        panel1.setSize(400, 400);
        panel3.setSize(400, 400);
        panel4.setSize(400, 400);
        panel3.setBackground(Color.pink);

        panel4.setBackground(Color.GRAY);

        g.gridx = 0;
        g.gridy = 0;
        panel1.add(panel2, g);
        //agregar barra al panel 2
        g1.gridx = 0;
        g1.gridy = 0;
        panel2.add(barra, g1);
        // agregar al panel 1 los demas paneles
        g.gridx = 1;
        g.gridy = 0;
        panel1.add(panel3, g);

        g.gridx = 1;
        g.gridy = 1;
        panel1.add(panel4, g);
        //agregar los campos de texto al panel 4

        g.gridx = 0;
        g.gridy = 0;
        panel4.add(infobach, g3);

        g.gridx = 0;
        g.gridy = 0;
        panel4.add(infobal, g3);
        g.gridx = 0;
        g.gridy = 0;
        panel4.add(infopop, g3);
        g.gridx = 0;
        g.gridy = 0;
        panel4.add(infosal, g3);
        g.gridx = 0;
        g.gridy = 0;
        panel4.add(inforoc, g3);
        
        lista.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse) {
             bachata();
        baladas();
        salsa();
        rock();
        pop();
            }
        });
        
    }

    public void bachata() {
        if (lista.isSelectedIndex(0)) {
            infobach.setText("La bachata es un género musical bailable originario\n de la República Dominicana, dentro de lo\n que se denomina folclore urbano.\n Está considerado como un derivado del bolero rítmico,\n con influencias de otros estilos como el son cubano y el merengue");
  }
        else infobach.setText("");
    }

    public void baladas() {
        if (lista.isSelectedIndex(1)) {
            infobal.setText("Es un recital o una canción que cuenta la vida\n de una persona o algunos hechos precisos. \nEl recital es siempre épico, normalmente dramático y a veces cómico.\n Si habla del amor entre dos personas, \nla identificamos con el romance.");
        }
           else infobal.setText("");
    }

    public void salsa() {
        if (lista.isSelectedIndex(2)) {
            infosal.setText("La salsa es un género musical bailable\n resultante de la síntesis del son cubano y otros géneros de música caribeña,\n con el jazz y otros ritmos estadounidenses. \nLa salsa fue consolidada como un éxito comercial por músicos de origen puertorriqueño\n en la ciudad de Nueva York en la década de 1960.");
        }   else infosal.setText("");
    }

    public void pop() {
        if (lista.isSelectedIndex(4)) {
            infopop.setText("La música pop es un estilo musical derivado de la música popular.\n Su nombre, pop, procede del inglés, que es un acortamiento del término popular,\n que en español traduce ‘popular’.");
        }   
        else infopop.setText("");
    }

    public void rock() {
        if (lista.isSelectedIndex(3)) {
            inforoc.setText("El rock es un término amplio que agrupa una variedad de géneros de música popular \noriginados como rock and roll a principios de la década de 1950 en Estados Unidos\n y que evolucionó en un gran rango de diferentes estilos en los 60,\n particularmente en Reino Unido y Estados Unidos.");
        }  
        else inforoc.setText("");
    }

    public static void main(String[] args) {
        new Grupalventanas();
    }

}
