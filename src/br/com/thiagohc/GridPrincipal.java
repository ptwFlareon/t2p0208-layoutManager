/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import br.com.adrianob.layout.Tela;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author thiag
 */
public class GridPrincipal extends JFrame implements Tela {

    public GridPrincipal() throws HeadlessException {
        super("Grid");
        this.setLayout(new GridLayout(0,2 ));
        JTextArea Texto = new JTextArea();
        this.add(Texto);
        JButton meuBotao = new JButton("Digite Algo e clique aqui");
        this.add(meuBotao);
        JButton mudaCor = new JButton("Vermelho");
        this.add(mudaCor);
        JButton mudaCor2 = new JButton("Azul");
        this.add(mudaCor2);
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, Texto.getText());
            }
        });
        mudaCor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Texto.setForeground(Color.red);
            }
        });
         mudaCor2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Texto.setForeground(Color.blue);
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