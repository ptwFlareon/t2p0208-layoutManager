package br.com.pedroenju;

import br.com.adrianob.layout.Tela;

public class TelaFactory1 implements br.com.adrianob.layout.TelaFactory {

    @Override
    public String getNome() {
        return "Tela One";
    }

    @Override
    public Tela create() {
        return new Tela1();
    }

}
