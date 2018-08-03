package br.com.alissonhs;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

public class Tela01Factory implements TelaFactory{

    @Override
    public String getNome() {
        return "Tela 01";
    }

    @Override
    public Tela create() {
        return new Tela01();
    }
    
}
