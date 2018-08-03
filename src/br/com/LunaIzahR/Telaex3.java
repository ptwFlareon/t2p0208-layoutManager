package br.com.LunaIzahR;

import br.com.adrianob.layout.Tela;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author izahR
 */
public class Telaex3 extends JFrame implements Tela{

    JLabel txt1, txt2, txt3; 
    JTextField tx1; 
    
    public Telaex3() throws HeadlessException {
        
        super ("Tela Ex 3"); 
        this.setLayout(new GridLayout(2, 2, 1, 1));
         
        this.txt1 = new JLabel(); 
        this.txt1.setText("It's only a machine");
        this.add(txt1); 
        
         this.txt2 = new JLabel(); 
        this.txt2.setText("It's move with energy");
        this.add(txt2); 
        
         this.txt3 = new JLabel(); 
        this.txt3.setText("It's a simple test");
        this.add(txt3); 
        
        this.tx1= new JTextField(); 
        this.tx1.setPreferredSize(new Dimension(100, 20));
        this.add(tx1); 
        
        
      this.pack();
        
    }

    
    
    @Override
    public void abrir() {
        this.setVisible(true);
    }
   
    
    
    
    
}
