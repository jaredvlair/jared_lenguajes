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
public class usuario {
    private float peso;
    private float altura;
    
    public void setPeso(float valor ){
        if (valor <0 )valor=-valor;
        peso=valor;
    }
    public void setAltura(float valor ){
        if (valor<0) valor=-valor;
        altura=valor;
    }
    public float getpeso (){
        return peso;
    }
    public float getaltura(){
        return altura;
    }
}
