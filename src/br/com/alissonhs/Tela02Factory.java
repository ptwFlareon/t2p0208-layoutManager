
package br.com.alissonhs;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author Alisson H. Silva
 */
public class Tela02Factory implements TelaFactory{

    @Override
    public String getNome() {
        return "Tela 02";
    }

    @Override
    public Tela create() {
        return new Tela02();
    }
        
}
