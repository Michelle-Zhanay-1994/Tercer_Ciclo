package Practica_15_01_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana_1 {

    JFrame Ventana_1 = new JFrame("Principal");
    JPanel p = new JPanel();
    JTextField t = new JTextField(20);
    JButton b = new JButton("Chequear");
    JLabel a = new JLabel("Que número de semana es ahora?");
    JFrame Ventana_2 = new JFrame("Resultado");
    JPanel p2 = new JPanel();
    JTextField t2 = new JTextField(20);
    JButton b2 = new JButton("TERMINAR");
    JButton c2 = new JButton("TRATAR DE NUEVO");
    JLabel a2 = new JLabel("CORRECTO");
    JLabel a3 = new JLabel("INCORRECTO");

    public Ventana_1() {
        Ventana_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana_1.setSize(250, 250);
        agregarComponentes();
        Ventana_1.setVisible(true);
        Ventana_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana_2.setSize(250, 250);
        a2.setVisible(false);
        b2.setVisible(false);
        a3.setVisible(false);
        c2.setVisible(false);
        agregarComponentes();
//    Ventana_2.setVisible(true);

    }

    public void agregarComponentes() {
        Ventana_1.getContentPane().add(p);
        Ventana_2.getContentPane().add(p2);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ventana_2.setVisible(true);
                try {
                    String texto = t.getText();
                    int d = Integer.parseInt(texto);
                    if (d == Calendar.WEEK_OF_YEAR) {
                        a2.setVisible(true);
                        b2.setVisible(true);
                        a3.setVisible(false);
                        c2.setVisible(false);
                    } else {
                        a3.setVisible(true);
                        c2.setVisible(true);

                    }
                } catch (NumberFormatException er) {
                    JOptionPane.showMessageDialog(t, "Intente nuevamente ingresando un número");
                }

            }

        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ventana_1.dispose();
                Ventana_2.dispose();

            }
        });
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ventana_1.setVisible(true);

            }
        });
        p.add(a);
        p.add(t);
        p.add(b);
        p2.add(a2);
        p2.add(b2);
        p2.add(a3);
        p2.add(c2);

    }

    public static void main(String[] args) {
        Ventana_1 obj = new Ventana_1();

    }
}
