package br.com.adrianob.layout;

import br.com.LunaIzahR.FactoryIzah;
import br.com.LunaIzahR.Factoryex2;
import br.com.LunaIzahR.Factoryex3;
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
        minhasFabricasDeTela[1] = new FactoryIzah(); //Instanciar sua fabrica de tela 1 aqui
        minhasFabricasDeTela[2] = new Factoryex2(); //Instanciar sua fabrica de tela 2 aqui
        minhasFabricasDeTela[3] = new Factoryex3(); //Instanciar sua fabrica de tela 3 aqui
        new Sample(minhasFabricasDeTela).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
