/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory;

import br.com.adrianob.layout.Tela;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class TelaThallysGrid extends JFrame implements Tela{

    JTextField edt1;
    JLabel label1;
    JButton botao1, botao2;
    
    public TelaThallysGrid() throws HeadlessException {
         super("Tela Thallys Border");
        this.setLayout(new GridLayout(2, 2));
        this.setLocationRelativeTo(null);
        
        this.label1 = new JLabel("Ano de nascimento: ");
        this.add(label1);
        
        this.edt1 = new JTextField();
        this.add(edt1);
        
        this.botao1 = new JButton("Sua Idade");
        this.add(botao1);
        botao1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int result = 2018 - Integer.parseInt(edt1.getText());
                 JOptionPane.showMessageDialog(null,"Você tem " + result + " anos de idade!");
             }
         });
        
        this.botao2 = new JButton("Limpar");
        this.add(botao2);
        botao2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 edt1.setText("");
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
