package br.com.LunaIzahR;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author izahR
 */
public class Factoryex2 implements TelaFactory{

    @Override
    public String getNome() {
       return "Tela exercicio 2";  
    }

    @Override
    public Tela create() {
        return new Telaex2(); 
    }
    
    
    
}
