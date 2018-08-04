/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rff;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author refra
 */
public class FactoryPrincipal implements TelaFactory{

    @Override
    public String getNome() {
        return "Exemplo 1";
    }

    @Override
    public Tela create() {
        return new TelaPrincipal();
    }
        
    
    
    
}
    

