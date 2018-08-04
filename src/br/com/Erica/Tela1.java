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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Erica
 */
public class Tela1 extends JFrame implements Tela{

    JTextField txt1;
    
    public Tela1() throws HeadlessException {
        super("Exemplo Flow");                         //super constroi a calsse pai
        this.setLayout(new FlowLayout());
        JButton meuBotao = new JButton("Clica ai");
        this.add(meuBotao);                         //mostra o botao
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá");
            }
        });
        
        this.txt1 = new JTextField();
        this.txt1.setPreferredSize(new Dimension(300, 20));
        this.add(txt1, BorderLayout.CENTER);
        
        this.pack();   //dimensiona o tamnho da tela com base dos componentes que estão dentro
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);    //fecha o formulario mas a aplicação continua rodando
        
    }
    
    
    @Override
    public void abrir() {
        this.setVisible(true);
    }
    
}
