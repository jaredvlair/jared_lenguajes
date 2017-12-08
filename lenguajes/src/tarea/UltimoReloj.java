/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Calendar;

/**
 *
 * @author jared
 */
public class UltimoReloj {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
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

        });
        t1.start();
    }

}
