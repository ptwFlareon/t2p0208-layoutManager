package br.com.lucasj;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

public class TelaJeffersonFactory implements TelaFactory {

    @Override
    public String getNome() {
        return "This is Jefferson";
    }

    @Override
    public Tela create() {
        return new TelaJefferson();
    }
    
}
