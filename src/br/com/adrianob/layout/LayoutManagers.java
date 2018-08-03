package br.com.adrianob.layout;

import br.com.Erica.Tela1Factory;
import br.com.Erica.Tela2Factory;
import br.com.Erica.Tela3Factory;
import javax.swing.JFrame;

/**
 *
 * @author drink
 */
public class LayoutManagers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaFactory[] minhasFabricasDeTela = new TelaFactory[4];
        minhasFabricasDeTela[0] = new TelaAdrianoFactory();
        minhasFabricasDeTela[1] = new Tela1Factory(); //Instanciar sua fabrica de tela 1 aqui
        minhasFabricasDeTela[2] = new Tela2Factory(); //Instanciar sua fabrica de tela 2 aqui
        minhasFabricasDeTela[3] = new Tela3Factory(); //Instanciar sua fabrica de tela 3 aqui
        new Sample(minhasFabricasDeTela).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
