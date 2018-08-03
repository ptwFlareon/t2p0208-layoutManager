package br.com.LunaIzahR;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author izahR
 */
public class FactoryIzah implements TelaFactory{

    @Override
    public String getNome() {
        return "Tela Principal"; 
    }

    @Override
    public Tela create() {
        return new TelaPrincipal();
    }
    
    
    
    
    
}
