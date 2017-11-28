/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import constructores.Animal;

/**
 *
 * @author jared
 */
public class Usuario {
    private float Peso;
    private float Altura;
    private float Peso1;
    private float Altura1;

    public float getPeso1() {
        return Peso1;
    }

    public void setPeso1(float Peso1) {
        this.Peso1 = Peso1;
    }

    public float getAltura1() {
        return Altura1;
    }

    public void setAltura1(float Altura1) {
        this.Altura1 = Altura1;
    }
              
    //consteuctor por defecto
    public Usuario (){
    System.out.println("estoy en el constructor");
    Peso=47;
    Altura=(float) 1.80;
     Peso1= 93;
    Altura1 =1.70f;
    }

    public Usuario(float Peso, float Altura) {
        this.Peso = Peso;
        this.Altura = Altura;
    }
    
    
    
    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
    
    
}
