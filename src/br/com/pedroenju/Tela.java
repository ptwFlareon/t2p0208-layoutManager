package br.com.pedroenju;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame implements br.com.adrianob.layout.Tela {

    public Tela() throws HeadlessException {

        super("Tela Exemplo");

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        JButton seuBotao = new JButton("Clica");
        this.add(seuBotao);
        seuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Why you click in the button?");
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
