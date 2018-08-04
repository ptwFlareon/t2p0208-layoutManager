/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nicolasg;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author ngnic
 */
public class BorderFactory implements TelaFactory{

    @Override
    public String getNome() {
        return "Border";
    }

    @Override
    public Tela create() {
        return new Border();
    }
    
    
}
