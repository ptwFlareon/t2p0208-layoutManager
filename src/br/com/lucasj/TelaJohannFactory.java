package br.com.lucasj;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

public class TelaJohannFactory implements TelaFactory {

    @Override
    public String getNome() {
        return "This is Johann";
    }

    @Override
    public Tela create() {
        return new TelaJohann();
    }
    
}
