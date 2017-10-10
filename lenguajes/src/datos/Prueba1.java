/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author jared
 */
public class Prueba1 {
    
    public static void main(String[] args) {
        //PROBAREMOS LOS TIPOS DE DATOS INTEGRALES
        byte b=2; //solo le cabe 2 elevado a la 8 entre dos 
        short s=2;//solo le cabe dos elevado a la 16 entre dos
        int i=2;//solo le cabe dos elevado a la 32
        long l=2;//solo le cabe dos a la sesentaicuatro
        //ALGUNAS DE LAS SIGUIENTE LINEAS VAN A MARCAR ERROR
        b=(byte)s;//aqui se le que el short va adentro del byte
        s=b;
        i=s;
        l=s;
        s=(short)l;// se le hara casting forzado 
        b=(byte)i;
          //los atributos debe ir adentrod e la clase  ya abajo del main      
       //los errorrees de datos se pueden quitar 
          //cuando se ve un  solo signo de igual en programacion , significa que se le asigna  de derecha a izquierda
    //algo chistoso con los flotantes
    float f =2.0f;
    double d=2.0;
//el valor double es por defecto asi que si se pone en float se debe hacer casting forzado
    
    boolean b1=true;
    boolean b2=false;
    
    //tipo caracter 
    char algo='h';
    char otro=' ';
    
    }
          
}
