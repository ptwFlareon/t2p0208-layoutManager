package br.com.lucasj;

import br.com.adrianob.layout.Tela;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class TelaJefferson extends JFrame implements Tela {

    public TelaJefferson() throws HeadlessException {
        super("Tela Jefferson");
        this.setLayout(new GridLayout(3, 1));
        //
        JButton btn01 = new JButton("Somente");
        this.add(btn01);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, ", ou");
            }
        });
        JButton btn02 = new JButton("um");
        this.add(btn02);
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "talvez");
            }
        });
        JButton btn03 = new JButton("teste!");
        this.add(btn03);
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "não!");
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
