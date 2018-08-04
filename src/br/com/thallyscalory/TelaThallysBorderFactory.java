/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author Usuario
 */
public class TelaThallysBorderFactory implements TelaFactory{

    @Override
    public String getNome() {
        return "Thallys Border";
    }

    @Override
    public Tela create() {
        return new TelaThallysBorder();
    }
    
}
