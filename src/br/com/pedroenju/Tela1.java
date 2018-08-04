package br.com.pedroenju;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Tela1 extends JFrame implements br.com.adrianob.layout.Tela {

    public Tela1() throws HeadlessException {

        super("Tela One");

        this.setLayout(new BorderLayout());

        JTextPane txtP = new JTextPane();
        this.add(txtP, BorderLayout.NORTH);
        txtP.setText("Uma tela com BorderLayout!!!");
        txtP.setPreferredSize(new Dimension(600, 50));

        JLabel lb = new JLabel("Qual sua cor favorita?");
        this.add(lb, BorderLayout.WEST);
        lb.setPreferredSize(new Dimension(200, 50));

        JTextField txtF = new JTextField();
        this.add(txtF, BorderLayout.CENTER);
        txtF.setPreferredSize(new Dimension(200, 50));

        JLabel lb2 = new JLabel();
        this.add(lb2, BorderLayout.SOUTH);
        lb2.setPreferredSize(new Dimension(600, 50));

        JButton btn = new JButton("Enviar");
        this.add(btn, BorderLayout.EAST);
        btn.setPreferredSize(new Dimension(200, 50));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtF.getText().toUpperCase().equals("AZUL")) {
                    lb2.setText("WooOOooOooOOooW");
                } else {
                    lb2.setText("Interessante...");
                }
            }
        });

        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

    @Override
    public void abrir() {
        this.setVisible(true);
    }

}
