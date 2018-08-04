package br.com.alissonhs;

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
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class Tela01 extends JFrame implements Tela{

    public Tela01() throws HeadlessException{
           super("Telinha 01");
           this.setLayout(new BorderLayout());
           JButton meuBotao = new JButton("Cabeçalho");
           this.add(meuBotao, BorderLayout.PAGE_START);
           meuBotao.addActionListener( new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   JOptionPane.showMessageDialog(null, "This Is North!");               }
           });
           meuBotao = new JButton("Centro");
            this.add(meuBotao, BorderLayout.CENTER);
            meuBotao.addActionListener( new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "This is Center!");
               }
           });
            meuBotao = new JButton("Esquerda");
            this.add(meuBotao, BorderLayout.LINE_START);
            meuBotao.addActionListener( new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "This is Left or West!");
               }
           });
            meuBotao = new JButton("Direita");
            this.add(meuBotao, BorderLayout.LINE_END);
            meuBotao.addActionListener( new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "This is Rigth or East!");
               }
           });
            meuBotao = new JButton("Rodapé");
            this.add(meuBotao, BorderLayout.PAGE_END);
            meuBotao.addActionListener( new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "This is South!");
               }
           });
            
           
    this.pack();
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void abrir() {
        this.setVisible (true);
    }
    
}
