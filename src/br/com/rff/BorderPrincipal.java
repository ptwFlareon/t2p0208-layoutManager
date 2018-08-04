/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rff;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author thiag
 */
public class BorderPrincipal extends JFrame implements Tela {

    public BorderPrincipal() throws HeadlessException {
        super("Border");
        this.setLayout(new BorderLayout());
        JLabel label = new JLabel();
        this.add(label, BorderLayout.NORTH);
        JTextArea Texto = new JTextArea();
        this.add(Texto, BorderLayout.CENTER);
        JButton meuBotao = new JButton("Digite Algo e clique");
        this.add(meuBotao, BorderLayout.SOUTH);
        JButton mudaCor = new JButton("azul");
        this.add(mudaCor, BorderLayout.EAST);
        JButton mudaCor2 = new JButton("Vermelho");
        this.add(mudaCor2, BorderLayout.WEST);
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, Texto.getText());
                label.setText(Texto.getText());
            }
        });
        mudaCor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Texto.setForeground(Color.blue);
            }
        });
         mudaCor2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Texto.setForeground(Color.red);
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