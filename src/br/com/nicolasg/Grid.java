/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nicolasg;

import br.com.adrianob.layout.Tela;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ngnic
 */
public class Grid extends JFrame implements Tela{

    public Grid() throws HeadlessException {
        super ("Grid");
        this.setLayout(new GridLayout());
        JButton meuBotao = new JButton();
        this.add(meuBotao);
        JLabel label = new JLabel("AS");
        this.add(label);
        JTextField text = new JTextField();
        this.add(text);
        JTextArea area = new JTextArea();
        this.add(area);
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Denovo?");
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
