/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author jared
 */
public class ProbarConstructores {
    public static void main(String[] args) {
        //creemos un objeto de la clase Animal 
        Animal algo=new Animal();
        int x=10;
        
        System.out.println(x);
                
        System.out.println(algo.getEdad());
        //la de arriba es para imprimir alores de retorno
         System.out.println(algo.getNombre());
         System.out.println(algo.isMuerde());
         Animal otro=new Animal(8);
         otro.setEdad(10);
         System.out.println(otro.getEdad() );
          //vamos a usar un cosntructor de una clse que
          //no hemos diseñado nosotros
          JFrame ventana=new JFrame("hola mundo");
          ventana.setSize(300,300);
          ventana.setVisible(true);
                 
    }
            
    
}
