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
    Usuario u;
    String resultado;
    public String  calcular (){
        float mivalor =u.getPeso()/(u.getaltura()*u.getaltura();
        resultado="Tu imc es "+mivalor;
        return resultado;
                
    }
    
}
