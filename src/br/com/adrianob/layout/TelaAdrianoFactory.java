package br.com.adrianob.layout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author drink
 */
public class TelaAdrianoFactory implements TelaFactory {

    @Override
    public String getNome() {
        return "Exemplo Adriano";
    }

    @Override
    public Tela create() {
        return new TelaAdriano();
    }

}
