package br.com.Erica;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Erica
 */
public class Tela2 extends JFrame implements Tela {

    JLabel label1, label2, label3;
    JTextField txt1;
    
    public Tela2() throws HeadlessException {
        super("Exemplo Border");  
        Dimension tamanho = new Dimension(200,20);
        this.setLayout(new BorderLayout());
        JButton meuBotao2 = new JButton("Clica ai nao");
        this.add(meuBotao2, BorderLayout.SOUTH);
        meuBotao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Olá Mundo!");
            }
        });
        this.label1 = new JLabel("Esse é um Border");
        this.add(label1, BorderLayout.NORTH);
        
        this.label2 = new JLabel("Texto sem sentido...");
        this.add(label2, BorderLayout.EAST);
        
        this.label3 = new JLabel("Só para ter algo escrito");
        this.add(label3, BorderLayout.WEST);
        
        this.txt1 = new JTextField();
        this.txt1.setPreferredSize(tamanho);
        this.add(txt1, BorderLayout.CENTER);
        
        
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    
    @Override
    public void abrir() {
               setVisible(true);
    }
    
    
}
