/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.adrianob.layout;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author drink
 */
public class TelaAdriano extends JFrame implements Tela {
    
    public TelaAdriano() throws HeadlessException {
        super("Exemplo");
        this.setLayout(new BorderLayout());
        this.add(new JButton("Só um botão"), BorderLayout.CENTER);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
    }
    
    @Override
    public void abrir() {
        this.setVisible(true);
    }
    
}
