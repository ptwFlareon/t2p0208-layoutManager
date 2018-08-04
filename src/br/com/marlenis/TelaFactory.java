
package br.com.marlenis;

import br.com.adrianob.layout.Tela;

/**
 *
 * @author Marlon
 */
public class TelaFactory implements br.com.adrianob.layout.TelaFactory{

    @Override
    public String getNome() {
       return "Tela Flow";
    }

    @Override
    public Tela create() {
      return new br.com.marlenis.Tela();  
    }
    
}
