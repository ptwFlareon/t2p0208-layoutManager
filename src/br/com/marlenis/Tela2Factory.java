/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlenis;

import br.com.adrianob.layout.Tela;

/**
 *
 * @author Marlon
 */
public class Tela2Factory implements br.com.adrianob.layout.TelaFactory{

    @Override
    public String getNome() {
        return ("tela Grid");
    }

    @Override
    public Tela create() {
        return new Tela2();
    }
    
}
