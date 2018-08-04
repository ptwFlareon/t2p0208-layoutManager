/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlenis;

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
 * @author Marlon
 */
public class Tela extends JFrame implements br.com.adrianob.layout.Tela {

    public Tela() throws HeadlessException {
        super("Exemplo 1");
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        JButton meuBotao = new JButton("clica ae parça");
        this.add(meuBotao);
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Olá");
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
