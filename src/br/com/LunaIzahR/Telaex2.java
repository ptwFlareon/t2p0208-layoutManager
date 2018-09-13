package br.com.LunaIzahR;

import br.com.adrianob.layout.Tela;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
 * @author izahR
 */
public class Telaex2 extends JFrame implements Tela{

    JLabel lbtxt1; 
    JTextField txt1, txt2; 
   
    
    public Telaex2() throws HeadlessException {
         super ("Tela exercicio 2"); 
        Dimension tamanho = new Dimension(200, 20); 
        this.setLayout(new BorderLayout());
        JButton btn2 = new JButton("Press here!"); 
        this.add(btn2, BorderLayout.SOUTH); 
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "There's nothing");
            }
        });
        this.lbtxt1 = new JLabel(); 
        this.lbtxt1.setText("It's only a Test");
        this.add(lbtxt1, BorderLayout.NORTH); 
        
        this.txt1 = new JTextField(); 
        this.txt1.setPreferredSize(tamanho);
        this.add(txt1, BorderLayout.WEST); 
        
        this.txt2 = new JTextField(); 
        this.txt2.setPreferredSize(tamanho);
        this.add(txt2, BorderLayout.EAST); 
        
        
        
        
        
        this.pack();
    }

    @Override
    public void abrir() {
        this.setVisible(true);
    }
  
    
    
    
}
