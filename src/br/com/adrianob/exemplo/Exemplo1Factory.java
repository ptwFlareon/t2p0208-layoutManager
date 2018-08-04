
package br.com.adrianob.exemplo;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author drink
 */
public class Exemplo1Factory implements TelaFactory{

    @Override
    public String getNome() {
        return "Exemplo 1";
    }

    @Override
    public Tela create() {
        return new Exemplo1();
    }
    
    
}
