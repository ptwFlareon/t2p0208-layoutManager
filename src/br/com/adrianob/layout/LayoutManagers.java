package br.com.adrianob.layout;

import br.com.thallyscalory.TelaThallysBorderFactory;
import br.com.thallyscalory.TelaThallysFactory;
import br.com.thallyscalory.TelaThallysGridFactory;
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
        minhasFabricasDeTela[1] = new TelaThallysFactory();
        minhasFabricasDeTela[2] = new TelaThallysBorderFactory();
        minhasFabricasDeTela[3] = new TelaThallysGridFactory();
        //minhasFabricasDeTela[1] = new TelaAdrianoFactory(); //Instanciar sua fabrica de tela 1 aqui
        //minhasFabricasDeTela[2] = new TelaAdrianoFactory(); //Instanciar sua fabrica de tela 2 aqui
        //minhasFabricasDeTela[3] = new TelaAdrianoFactory(); //Instanciar sua fabrica de tela 3 aqui
        new Sample(minhasFabricasDeTela).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
