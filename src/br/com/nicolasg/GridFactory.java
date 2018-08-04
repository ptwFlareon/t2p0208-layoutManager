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
public class GridFactory implements TelaFactory{

    @Override
    public String getNome() {
        return "Grid";
    }

    @Override
    public Tela create() {
        return new Grid();    
    }
    
    
}
