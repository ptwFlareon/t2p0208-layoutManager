package br.com.pedroenju;

import br.com.adrianob.layout.Tela;

public class TelaFactory3 implements br.com.adrianob.layout.TelaFactory {

    @Override
    public String getNome() {
        return "Tela Three";
    }

    @Override
    public Tela create() {
        return new Tela3();
    }

}
