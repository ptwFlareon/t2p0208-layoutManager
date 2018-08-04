/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlenis;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Marlon
 */
public class Tela2 extends JFrame implements br.com.adrianob.layout.Tela {

    public Tela2() throws HeadlessException {
        super ("exemplo 3");
        this.setLayout(new GridLayout(2,2));
        JScrollPane scroll = new JScrollPane();
        scroll.setPreferredSize(new Dimension(200, 600));
        
    }
    
    
    
    @Override
    public void abrir() {
       this.setVisible(true);
    }
    
}
