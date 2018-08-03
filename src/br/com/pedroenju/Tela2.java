package br.com.pedroenju;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela2 extends JFrame implements br.com.adrianob.layout.Tela {

    public Tela2() throws HeadlessException {

        super("Tela Two");
        
        this.setLayout(new FlowLayout());
        
        JLabel lab1 = new JLabel("Informe um número");
        this.add(lab1);
        
        JTextField txt1 = new JTextField();
        txt1.setPreferredSize(new Dimension(100, 35));
        this.add(txt1);
        
        JLabel lab2 = new JLabel("Informe um número");
        this.add(lab2);
        
        JTextField txt2 = new JTextField();
        txt2.setPreferredSize(new Dimension(100, 35));
        this.add(txt2);
        
        JButton btn1 = new JButton("Calcular");
        this.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float soma = Float.parseFloat(txt1.getText()) + Float.parseFloat(txt2.getText());
                float div = Float.parseFloat(txt1.getText()) / Float.parseFloat(txt2.getText());
               float sub = Float.parseFloat(txt1.getText()) - Float.parseFloat(txt2.getText());
               float mult = Float.parseFloat(txt1.getText()) * Float.parseFloat(txt2.getText());
                JOptionPane.showMessageDialog(null, 
                        "Soma.: " + soma + "\r\n" + 
                        "Subtração.: " + sub + "\r\n" +
                        "Divisão.: " + div + "\r\n" +
                        "Multiplicação.: " + mult
                                );
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
