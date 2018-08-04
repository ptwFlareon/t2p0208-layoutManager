package br.com.nicolasg;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame implements Tela{

    public TelaPrincipal() throws HeadlessException {
        super("TelaPrincipal");
        this.setLayout(new FlowLayout());
        JButton meuBotao = new JButton("Clique aqui");
        this.add(meuBotao);
        JLabel label = new JLabel("AS");
        this.add(label);
        JTextField text = new JTextField();
        this.add(text);
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Oie");
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
