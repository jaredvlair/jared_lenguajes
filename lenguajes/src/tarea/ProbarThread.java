/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author jared
 */
public class ProbarThread {
    public static void main(String[] args) {
        Primero p=new Primero ();
        Primero1 s=new Primero1 ();
        //thread en estado de ejecucion 
        p.start();
        s.start();
    }
    
}
