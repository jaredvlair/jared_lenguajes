/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jared
 */
public class Primero1 extends Thread {
    public void run (){
        while (true){
        // aqui pones la accion de tu thread
        System.out.println("soy el segundo thread ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Primero1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
}
