package br.com.adrianob.layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author drink
 */
public class Sample extends JFrame implements ActionListener {

    private TelaFactory[] telasf = null;

    public Sample(TelaFactory[] fabricasDeTelas) throws HeadlessException {
        super("Tela de exemplo e Explicação");
        this.getContentPane().setLayout(new FlowLayout());
        this.telasf = fabricasDeTelas;
        criaPaineis();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    private void criaPaineis() {
        criaPainelCentral();
        criaPainelSuperior();
        criaPainelInferior();
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

    private void criaPainelInferior() {
        JPanel pninferior = new JPanel(new GridLayout(2, 2, 0, 0));
        this.add(pninferior, BorderLayout.SOUTH);
        if (telasf.length > 4) {
            JOptionPane.showMessageDialog(this, "Você deve informar até 4 fábricas de telas!");
        }
        for (int i = 0; i < telasf.length; i++) {
            TelaFactory telaFactory = telasf[i];
            if (telaFactory != null) {
                JButton btn = new JButton("Abrir tela " + telaFactory.getNome());
                btn.setActionCommand(Integer.toString(i));
                btn.addActionListener(this);
                pninferior.add(btn);
            }
        }
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

    private void criaPainelEsquerda() {
        JPanel pn = new JPanel(new FlowLayout());

        JTextArea txt = new JTextArea(""
                + "Este texto está em textarea,\r\n "
                + "é um exemplo de painel alinhado a WEAST. \r\n"
                + "No quadro que está no centro há uma Label\r\n"
                + " contendo uma imagem. \r\n"
                + "Esta imagem é um índice para os nomes de arquivos de imagens \r\n"
                + "que existe no pacote resources deste projeto.");
        JScrollPane scroll = new JScrollPane(txt);
        scroll.setPreferredSize(new Dimension(200, 600));
        pn.add(scroll);
        this.add(pn, BorderLayout.WEST);
    }

    private void criaPainelDireita() {
        JPanel pn = new JPanel(new GridLayout(0, 1));
        JScrollPane scroll = new JScrollPane(pn);
        scroll.setPreferredSize(new Dimension(200, 600));
        this.add(scroll, BorderLayout.EAST);
        for (int i = 1; i <= 96; i++) {
            try {
                URL resource = getClass().getResource("/resources/" + i + ".png");
                if (resource != null) {
                    File file = new File(resource.toURI());
                    ImageIcon img = new ImageIcon(file.getPath());
                    JButton btn = new JButton("Botão " + i, img);
                    btn.setIconTextGap(2);
                    pn.add(btn);
                }
            } catch (URISyntaxException ex) {
                System.out.println(ex.getMessage());
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
