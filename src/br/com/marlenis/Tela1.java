/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlenis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Marlon
 */
public class Tela1 extends JFrame implements br.com.adrianob.layout.Tela{

    public Tela1() throws HeadlessException{
        super ("Tela Border");
        this.setLayout(new BorderLayout());  
        this.criaPaineis();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    
    @Override
    public void abrir() {
        this.setVisible(true);
    }
    
    
    
    
    private void criaPaineis() {
        criaPainelCentral();
        criaPainelSuperior();
        criaPainelInferior();
        criaPainelEsquerda();
        criaPainelDireita();
}

    
    
    
    private void criaPainelCentral() {
        JPanel pncentro = new JPanel();
        this.add(pncentro, BorderLayout.CENTER);
        JLabel label = new JLabel("AI");
        pncentro.add(label);       
    }

    
    
    
    private void criaPainelSuperior() {
        JPanel pnsuperior = new JPanel();
        this.add(pnsuperior, BorderLayout.NORTH);
        JLabel label = new JLabel("DA");
        pnsuperior.add(label);
    }

    
    
    
    private void criaPainelInferior() {
      JPanel pninferior = new JPanel();  
      this.add(pninferior, BorderLayout.SOUTH);
      JButton btn1 = new JButton("Botão sem Utilidade");
      JButton btn2 = new JButton("Botão Surpresa");
      
       btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("calc");
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
            }        
   });
        JButton btn3 = new JButton("Botão sem Utilidade");
        pninferior.add(btn1);
        pninferior.add(btn2);
        pninferior.add(btn3);
  }

    
    
    
    private void criaPainelDireita() {
        JPanel pndireita = new JPanel();
        this.add(pndireita, BorderLayout.WEST);
        JLabel label = new JLabel("NOTA");
        pndireita.add(label);        
    }
    
    
    

    private void criaPainelEsquerda() {
        JPanel pnesquerda = new JPanel();
        this.add(pnesquerda, BorderLayout.EAST);
        JLabel label = new JLabel("PROFESSOR");
        pnesquerda.add(label);       
        
    }
    }
    
    
