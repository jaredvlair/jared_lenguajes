/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresAritmeticos;

import java.util.Scanner;

/**
 *
 * @author jared
 */
public class operadores {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        float  numero1,numero2,suma, resta,mul,div,resto;
        
        System.out.println("Digite dos numeros ");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        suma = numero1+numero2;
        resta=numero1-numero2;
        mul= numero1 * numero2;
        div=numero1/numero2;
        resto=numero1%numero2;
        System.out.println("suma"+suma);
        System.out.println("resta"+resta);
        
        
    }
    
}
