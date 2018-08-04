package br.com.pedroenju;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela3 extends JFrame implements br.com.adrianob.layout.Tela, ActionListener {

    private JButton[] btn = new JButton[9];

    public Tela3() throws HeadlessException {

        super("Tela Three");

        this.setLayout(new GridLayout(3, 3, 1, 1));

        for (int i = 0; i < this.btn.length; i++) {

            this.btn[i] = new JButton();
            this.btn[i].setPreferredSize(new Dimension(200, 50));
            int tmp = i + 1;
            this.btn[i].setText(String.valueOf(tmp));
            this.btn[i].addActionListener(this);
            this.btn[i].setActionCommand("C" + tmp);
            this.add(this.btn[i], i);

        }

        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @Override
    public void abrir() {
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Random ran = new Random();
        int tmp = ran.nextInt(101);
        String tmp2 = String.valueOf(tmp);
        
        if (e.getActionCommand().equals("C1")) {
            this.btn[0].setText(tmp2);
        } else if (e.getActionCommand().equals("C2")) {
            this.btn[1].setText(tmp2);
        } else if (e.getActionCommand().equals("C3")) {
            this.btn[2].setText(tmp2);
        } else if (e.getActionCommand().equals("C4")) {
            this.btn[3].setText(tmp2);
        } else if (e.getActionCommand().equals("C5")) {
            this.btn[4].setText(tmp2);
        } else if (e.getActionCommand().equals("C6")) {
            this.btn[5].setText(tmp2);
        } else if (e.getActionCommand().equals("C7")) {
            this.btn[6].setText(tmp2);
        } else if (e.getActionCommand().equals("C8")) {
            this.btn[7].setText(tmp2);
        } else {
            this.btn[8].setText(tmp2);
        }
        
    }
}
