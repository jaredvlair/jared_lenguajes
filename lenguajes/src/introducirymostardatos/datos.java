/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducirymostardatos;

import java.util.Scanner;



/**
 *
 * @author jared
 */
public class datos {
    public static void main(String[] args) {
        Scanner digite =new Scanner(System.in);
        int numero ;
        System.out.println ("Digite un numero ");
        numero = digite.nextInt();
        System.out.println("El numero digitado es "+numero);
        
        //colocar caracteres en cadena
        Scanner letra = new Scanner(System.in);
        char cadena ;
        System.out.println("escriba una letra" );
        cadena =(char) letra.next().charAt(0);
//.charAt(0)
        System.out.println("la csdena es "+cadena);
                }
        
    
}
