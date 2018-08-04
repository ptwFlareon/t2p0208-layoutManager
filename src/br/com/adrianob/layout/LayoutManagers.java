package br.com.adrianob.layout;

import javax.swing.JFrame;

/**
 *
 * @author drink
 */
public class LayoutManagers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        TelaFactory[] minhasFabricasDeTela = new TelaFactory[31];
        minhasFabricasDeTela[0] = new TelaAdrianoFactory();
        minhasFabricasDeTela[1] = new br.com.Erica.Tela1Factory();
        minhasFabricasDeTela[2] = new br.com.Erica.Tela2Factory();
        minhasFabricasDeTela[3] = new br.com.Erica.Tela3Factory();
        minhasFabricasDeTela[4] = new br.com.LunaIzahR.FactoryIzah();
        minhasFabricasDeTela[5] = new br.com.LunaIzahR.Factoryex2();
        minhasFabricasDeTela[6] = new br.com.LunaIzahR.Factoryex3();
        minhasFabricasDeTela[7] = new br.com.alissonhs.Tela01Factory();
        minhasFabricasDeTela[8] = new br.com.alissonhs.Tela02Factory();
        minhasFabricasDeTela[9] = new br.com.alissonhs.Tela03Factory();
        minhasFabricasDeTela[10] = new br.com.lucasj.TelaJeffersonFactory();
        minhasFabricasDeTela[11] = new br.com.lucasj.TelaJhonsonFactory();
        minhasFabricasDeTela[12] = new br.com.lucasj.TelaJohannFactory();
        minhasFabricasDeTela[13] = new br.com.marlenis.Tela1Factory();
        minhasFabricasDeTela[14] = new br.com.marlenis.Tela2Factory();
        minhasFabricasDeTela[15] = new br.com.marlenis.TelaFactory();
        minhasFabricasDeTela[16] = new br.com.nicolasg.BorderFactory();
        minhasFabricasDeTela[17] = new br.com.nicolasg.GridFactory();
        minhasFabricasDeTela[18] = new br.com.nicolasg.TelaPrincipalFactory();
        minhasFabricasDeTela[19] = new br.com.pedroenju.TelaFactory1();
        minhasFabricasDeTela[20] = new br.com.pedroenju.TelaFactory2();
        minhasFabricasDeTela[21] = new br.com.pedroenju.TelaFactory3();
        minhasFabricasDeTela[22] = new br.com.rff.BorderFactory();
        minhasFabricasDeTela[23] = new br.com.rff.FactoryPrincipal();
        minhasFabricasDeTela[24] = new br.com.rff.NovaGrid();
        minhasFabricasDeTela[25] = new br.com.thallyscalory.TelaThallysBorderFactory();
        minhasFabricasDeTela[26] = new br.com.thallyscalory.TelaThallysFactory();
        minhasFabricasDeTela[27] = new br.com.thallyscalory.TelaThallysGridFactory();
        minhasFabricasDeTela[28] = new br.com.thiagohc.BorderFactory();
        minhasFabricasDeTela[29] = new br.com.thiagohc.FactoryPrincipal();
        minhasFabricasDeTela[30] = new br.com.thiagohc.GridFactory();
        
        new Sample(minhasFabricasDeTela).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
