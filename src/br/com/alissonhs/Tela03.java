
package br.com.alissonhs;

import br.com.adrianob.layout.Tela;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Tela03 extends JFrame implements Tela{

    public Tela03() {
        super ("Telinha 3");
        this.setLayout(new GridLayout(3, 3, 1, 1));
        JLabel lb2 = new JLabel("2!");
        JLabel lb1 = new JLabel("1!");
        JLabel lb3 = new JLabel("3!");
        JLabel lb4 = new JLabel("4!");
        JLabel lb5 = new JLabel("5!");
        JLabel lb6 = new JLabel("6!");
        JLabel lb7 = new JLabel("7!");
        JLabel lb8 = new JLabel("8!");
        JLabel lb9 = new JLabel("9!");
        JButton btOrgan = new JButton("Tap");
        this.add(lb9);
        this.add(lb8);
        this.add(lb7);
        this.add(lb6);
        this.add(lb5);
        this.add(lb4);
        this.add(lb3);
        this.add(lb2);
        this.add(lb1);
        btOrgan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "teste!");
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

   
