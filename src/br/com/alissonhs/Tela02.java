/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alissonhs;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Alisson H. Silva
 */
public class Tela02  extends JFrame implements Tela{

    public Tela02() throws HeadlessException {
         super ("Telinha 02");
         this.setLayout(new FlowLayout());
         JButton myButton = new JButton("Clique Aqui!");
         JLabel myLabel1 = new JLabel("Ou");
         JButton myButton2 = new JButton("Aqui!");
         JLabel myLabel2 = new JLabel("Ou");
         JButton myButton3 = new JButton("Aqui!");
         JLabel myLabel3 = new JLabel(".");
         this.add (myButton);
         this.add(myButton2);
         this.add(myButton3);
         myButton.addActionListener( new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "Errado '-'");
                 JOptionPane.showMessageDialog(null, "Tente Novamente!");
                 return;
             }
            
         });
         myButton2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Errado '-'");
                 JOptionPane.showMessageDialog(null, "Tente Novamente!");
                 return;
             }
         });
          myButton3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "CERTO!");
                 JOptionPane.showMessageDialog(null, "Você Ganhou!");
                 return;
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
    
    
    
   

