/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nicolasg;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
public class Border extends JFrame implements Tela{

    public Border() throws HeadlessException {
        super ("Border");
        
        this.setLayout(new BorderLayout());
        JButton meuBotao = new JButton("Clica denovo");
        this.add(meuBotao, BorderLayout.WEST);
        JButton meuBotao1 = new JButton("Clica denovo");
        this.add(meuBotao1, BorderLayout.EAST);
        JButton meuBotao2 = new JButton("Clica denovo");
        this.add(meuBotao2, BorderLayout.NORTH);
        JButton meuBotao3 = new JButton("Clica denovo");
        this.add(meuBotao3, BorderLayout.SOUTH);
        JTextArea area = new JTextArea();
        this.add(area, BorderLayout.CENTER);
        area.setPreferredSize(new Dimension(400, 400));
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Oie denovo");
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
