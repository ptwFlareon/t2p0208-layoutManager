package br.com.rff;


import br.com.adrianob.layout.Tela;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GridPrincipal extends JFrame implements Tela{

    public GridPrincipal() throws HeadlessException {
        super("Exemplo 2");
        this.setLayout(new GridLayout());
        JButton meuBotao = new JButton("clique");
        this.add(meuBotao);
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "Oi");   
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