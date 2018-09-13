package br.com.adrianob.layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.Border;

/**
 *
 * @author drink
 */
public class Sample extends JFrame implements ActionListener {

    private TelaFactory[] telasf = null;

    public Sample(TelaFactory[] fabricasDeTelas) throws HeadlessException {
        super("Tela de exemplo e Explicação");
        this.getContentPane().setLayout(new GridLayout(2, 0,10,10));
        this.telasf = fabricasDeTelas;
        criaPaineis();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    private void criaPaineis() {
        criaPainelCentral();
        criaPainelSuperior();
        criaPainelEsquerda();
        criaPainelDireita();
    }

    private void criaPainelSuperior() {
        JTextPane pnsup = new JTextPane();
        this.add(pnsup, BorderLayout.NORTH);
        StringBuilder meuTexto = new StringBuilder();
        meuTexto.append("<h2 style=\"color:red; text-align:center;\">Exemplos</h2>");
        meuTexto.append("<p style=\"width:60%; font-size:12px;\"> ");
        meuTexto.append("Este texto está dentro de um JTextPane ");
        meuTexto.append("que por sua vez está dentro ");
        meuTexto.append(" do formulário, alinhado em NORTH.</p>");
        pnsup.setContentType("text/html");
        pnsup.setText(meuTexto.toString());
    }

    private void criaPainelCentral() {
        JPanel pn = new JPanel();
        URL resource = getClass().getResource("/resources/indice-imagens.png");
        try {
            File file = new File(resource.toURI());
            ImageIcon img = new ImageIcon(file.getPath());
            JLabel imagem = new JLabel(img);
            pn.add(imagem);
        } catch (URISyntaxException ex) {
            System.out.println(ex.getMessage());
        }
        this.add(pn, BorderLayout.CENTER);
    }
    private JPanel top10 = null;
    private int[] idxTop = new int[]{7,10,12,13,19,20,21,27,30}; 
    private void criaPainelEsquerda() {
        top10 = new JPanel(new GridLayout(3,3));
        
        top10.setBorder(BorderFactory.createTitledBorder("9 telas mais criativas"));
        this.add(top10);
    }

    private void criaPainelDireita() {
        JPanel pn = new JPanel(new GridLayout(7, 3,2,2));
        pn.setBorder(BorderFactory.createTitledBorder("Todas as telas"));
        JScrollPane scroll = new JScrollPane(pn);
        scroll.setPreferredSize(new Dimension(200, 600));
        this.add(scroll, 0);
        for (int i = 0; i < telasf.length; i++) {
            TelaFactory telaFactory = telasf[i];

            if (telaFactory != null) {
                try {
                    URL resource = getClass().getResource("/resources/" + i + ".png");
                    if (resource != null) {
                        File file = new File(resource.toURI());
                        ImageIcon img = new ImageIcon(file.getPath());
                        JButton btn = new JButton("Abrir tela " + telaFactory.getNome(), img);
                        btn.setIconTextGap(2);
                        btn.setActionCommand(Integer.toString(i));
                        btn.addActionListener(this);
                        pn.add(btn);
//                        System.out.println(Arrays.binarySearch(idxTop, i));
                        if ( Arrays.binarySearch(idxTop, i) >= 0 ){
                            top10.add(btn);
                        }
                    }
                } catch (URISyntaxException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int idx = Integer.parseInt(e.getActionCommand());
        Tela tela = telasf[idx].create();
        tela.abrir();
    }

}
