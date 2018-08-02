package br.com.lucasj;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaJhonson extends JFrame implements Tela {

    public TelaJhonson() throws HeadlessException {
        super("Tela Jhonson");
        this.setLayout(new BorderLayout());
        //
        JButton btn01 = new JButton("Clica ai");
        this.add(btn01, BorderLayout.NORTH);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Adrian");
            }
        });
        JButton btn02 = new JButton("Clica ai");
        this.add(btn02, BorderLayout.SOUTH);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Jhonson");
            }
        });
        JButton btn03 = new JButton("Clica ai");
        this.add(btn03, BorderLayout.WEST);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Johann");
            }
        });
        JButton btn04 = new JButton("Clica ai");
        this.add(btn04, BorderLayout.EAST);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Jefferson");
            }
        });
        //
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void abrir() {
        this.setVisible(true);
    }

}
