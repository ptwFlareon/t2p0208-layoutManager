package br.com.lucasj;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class TelaJohann extends JFrame implements Tela {

    public TelaJohann() throws HeadlessException {
        super("Tela Johann");
        this.setLayout(new FlowLayout());
        //
        JButton btn01 = new JButton("Não clique.");
        this.add(btn01);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(2);
            }
        });
        JButton btn02 = new JButton("Não clique.");
        this.add(btn02);
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "From the left to the right!");
            }
        });
        JButton btn03 = new JButton("Não clique.");
        this.add(btn03);
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "God knows!");
                while (true) {
                    
                }
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
