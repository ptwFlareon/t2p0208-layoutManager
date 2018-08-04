/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlenis;

/**
 *
 * @author Marlon
 */
public class Tela1Factory implements br.com.adrianob.layout.TelaFactory{

    @Override
    public String getNome() {
       return "Tela Border";
    }

    @Override
    public br.com.adrianob.layout.Tela create() {
      return new br.com.marlenis.Tela1();  
    }
    
}
