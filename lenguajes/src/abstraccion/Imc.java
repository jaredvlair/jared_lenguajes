/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author jared
 */
public class Imc {
    usuario u;
    String resultado;
    public String  calcular (){
        float mivalor =u.peso/(u.altura*u.altura);
        resultado="Tu imc es "+mivalor;
        return resultado;
                
    }
    
}
