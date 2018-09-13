package br.com.Erica;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author Erica
 */
public class Tela2Factory implements TelaFactory{

    @Override
    public String getNome() {
        return "Tela 2";
    }

    @Override
    public Tela create() {
        return new Tela2();
    }
    
}
