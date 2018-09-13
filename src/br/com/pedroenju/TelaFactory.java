package br.com.pedroenju;

import br.com.adrianob.layout.Tela;

public class TelaFactory implements br.com.adrianob.layout.TelaFactory {

    @Override
    public String getNome() {
        return "Tela Exemplo";
    }

    @Override
    public Tela create() {
        return new br.com.pedroenju.Tela();
    }

}
