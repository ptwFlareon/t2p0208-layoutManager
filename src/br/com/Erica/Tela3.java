package br.com.Erica;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Erica
 */
public class Tela3 extends JFrame implements Tela {

    JLabel label1, label2;
    JTextField txt1;
    
    public Tela3() throws HeadlessException {
         super("Exemplo GRID");  
         this.setLayout(new GridLayout(2,2,1,1));
         
         this.label1 = new JLabel("Esse é um GRID");
         this.add(label1);
                 
         this.label2 = new JLabel("Space 2");
         this.add(label2);
                 
         this.txt1 = new JTextField();
         this.txt1.setPreferredSize(new Dimension(50, 20));
         this.add(txt1);
         
         JButton meubotao4 = new JButton("só pra ter");
         this.add(meubotao4);
         meubotao4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Tudo OK");
             }
         });
         
         
         
        
        
       this.pack();
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    @Override
    public void abrir() {
        setVisible(true);
    }
    
}
