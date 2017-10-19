/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import constructores.*;
import javax.swing.JFrame;

/**
 *
 * @author jared
 */
public class ProbarConstructores {
    
       public static void main(String[] args) {
        Usuario persona= new Usuario();
        int x=10;
        
        System.out.println(x);
                
        System.out.println(persona.getPeso());
        //la de arriba es para imprimir alores de retorno
         System.out.println(persona.getAltura());
          
    

       
           Usuario persona1=new Usuario();
                  
      System.out.println(persona1.getPeso1());
      System.out.println(persona1.getAltura1());
    }
} 
    
            
    

