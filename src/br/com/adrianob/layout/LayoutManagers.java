package br.com.adrianob.layout;

import br.com.thiagohc.BorderFactory;
import br.com.thiagohc.FactoryPrincipal;
import br.com.thiagohc.GridFactory;
import br.com.thiagohc.GridPrincipal;
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
        minhasFabricasDeTela[1] = new FactoryPrincipal(); //Instanciar sua fabrica de tela 1 aqui
        minhasFabricasDeTela[2] = new GridFactory(); //Instanciar sua fabrica de tela 2 aqui
        minhasFabricasDeTela[3] = new BorderFactory(); //Instanciar sua fabrica de tela 3 aqui
        new Sample(minhasFabricasDeTela).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
