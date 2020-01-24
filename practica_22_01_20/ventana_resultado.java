package practica_22_01_20;

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

public class ventana_resultado extends JFrame {

    JPanel pr = new JPanel();
    JLabel ar = new JLabel();
    JButton br = new JButton();
    JTextField cr = new JTextField(15);

    public ventana_resultado() {
        super("Ventana Resultado");
        setLocation(400, 200);
        setSize(300, 200);
        dispose();
        agregarComponentes();
        setVisible(true);
    }

    public void agregarComponentes() {
        getContentPane().add(pr);
        pr.setLayout(new GridBagLayout());
        GridBagConstraints gr = new GridBagConstraints();
        gr.gridx = 0;
        gr.gridy = 0;
        gr.insets = new Insets(10, 10, 10, 10);

        pr.add(ar, gr);
        gr.gridy = 1;
        pr.add(br, gr);
        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (br.getText() == "Terminar") {
                    System.exit(0);
                }else{
                    dispose();
                }
                }
            }
        );

    }

}
