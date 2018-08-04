/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Usuario
 */
public class TelaThallysBorder extends JFrame implements Tela{
    
    JLabel label1, label2, label3;  
    JTextField edt1, edt2;

    public TelaThallysBorder() throws HeadlessException {
        super("Tela Thallys Border");
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        
        this.label1 = new JLabel("Somar 2 Numeros Inteiros:");
        this.label1.setPreferredSize(new Dimension(160, 20));
        this.add(this.label1, BorderLayout.NORTH);
        
        JPanel pn = new JPanel(new FlowLayout());
        this.label2 = new JLabel("Informe o 1º numero:");
        this.label2.setPreferredSize(new Dimension(130, 20));
        pn.add(this.label2);
        
         this.edt1 = new  JTextField();
         this.edt1.setPreferredSize(new Dimension(230, 20));
         pn.add(this.edt1);
         
        this.label3 = new JLabel("Informe o 2º numero:");
        this.label3.setPreferredSize(new Dimension(130, 20));
        pn.add(this.label3);
        
        this.edt2 = new  JTextField();
        this.edt2.setPreferredSize(new Dimension(230, 20));
         pn.add(this.edt2);
        this.add(pn, BorderLayout.CENTER);
        
        JButton botao1 = new JButton("Calcular");
        this.add(botao1, BorderLayout.SOUTH);
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = Integer.parseInt(edt1.getText()) + Integer.parseInt(edt2.getText());
                
                JOptionPane.showMessageDialog(null,"Total: " + result);
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
