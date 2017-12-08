/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jared
 */
public class RelojitoChafa implements Runnable {

    public static void main(String[] args) {
        //Creamos el thread con esta interfaz
        Runnable r = new RelojitoChafa();
        Thread t1 = new Thread(r);
        t1.start();

    }

    public void run() {
        while (true) {

            try {

                Calendar c = Calendar.getInstance();
                //sacamos la hota del sistema
                Thread.sleep(1000);
                int hora = c.get(Calendar.HOUR);
                int minuto = c.get(Calendar.MINUTE);
                int segundo = c.get(Calendar.SECOND);
                System.out.println("lahora es" + hora + ":" + minuto);
            } catch (InterruptedException e) {

            }
        }
    }
}