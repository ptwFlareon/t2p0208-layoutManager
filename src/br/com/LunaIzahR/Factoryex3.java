package br.com.LunaIzahR;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author izahR
 */
public class Factoryex3 implements TelaFactory{

    @Override
    public String getNome() {
        return "Tela ex 3";
    }

    @Override
    public Tela create() {
        return new Telaex3(); 
    }
    
    
    
}
