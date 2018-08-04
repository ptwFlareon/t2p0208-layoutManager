package br.com.LunaIzahR;

import br.com.adrianob.layout.Tela;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author izahR
 */
public class TelaPrincipal extends JFrame implements Tela {

    JTextField txt1, txt2;
    
    public TelaPrincipal() throws HeadlessException {
        super("Tela Principal");
        this.setLayout(new FlowLayout());
        JButton meuBotao = new JButton ("clique aqui"); // cria o botao
        this.add(meuBotao); 
        meuBotao.addActionListener(new ActionListener() { // faz a ação do botao 
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello!");
            }
        });
        
         this.txt1= new JTextField(); 
        this.txt1.setPreferredSize(new Dimension(100, 20));
        this.add(txt1); 
        
         this.txt2= new JTextField(); 
        this.txt2.setPreferredSize(new Dimension(150, 20));
        this.add(txt2); 
        
        this.pack(); // dimensiona a tela(JFrame) conforme oq tem dentro
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // não encerra a operação, apenas fecha.
    }
    
    

    @Override
    public void abrir() {
        this.setVisible(true); // faz aparecer a tela na tela.
    }
   
    
    
    
    
}
