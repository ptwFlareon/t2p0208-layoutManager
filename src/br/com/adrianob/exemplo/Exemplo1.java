package br.com.adrianob.exemplo;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author drink
 */
public class Exemplo1 extends JFrame implements Tela {

    public Exemplo1() throws HeadlessException {
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
