/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TelaThallys extends JFrame implements Tela{

    public TelaThallys() throws HeadlessException {
        super("Tela Thallys");
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        
        JButton botao1 = new JButton("clicar");
        this.add(botao1);
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "clicou!");
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
