package br.com.Erica;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author Erica
 */
public class Tela1Factory implements TelaFactory {

    @Override
    public String getNome() {
       return "Tela 1";
    }

    @Override
    public Tela create() {
        return new Tela1();  //cria a classe e retorna
    }
    
}
