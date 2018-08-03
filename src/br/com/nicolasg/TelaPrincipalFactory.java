package br.com.nicolasg;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

public class TelaPrincipalFactory implements TelaFactory{

    @Override
    public String getNome() {
        return "TelaPrincipal";
    }

    @Override
    public Tela create() {
        return new TelaPrincipal();
    }
    
    
}
