/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rff;

import br.com.adrianob.layout.Tela;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author refra
 */
public class TelaPrincipal extends JFrame implements Tela{

    public TelaPrincipal() throws HeadlessException {
        super("Exemplo 1");
        this.setLayout(new FlowLayout());
        JButton meuBotao = new JButton("Clica ai");
        this.add(meuBotao);
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "Olá");   
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
