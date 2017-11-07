/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entregarjopcionpanel;

import javax.swing.JOptionPane;

public class prueba1 {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        cadena = JOptionPane.showInputDialog("digite una cadena ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite unn entero"));
        letra= JOptionPane.showInputDialog("digite un caracter").charAt(0);
        decimal= Double.parseDouble(JOptionPane.showInputDialog("DIGITE UN  DECIMAL"));
        
        //MOSTRAREMOS LOS DATOS PEDIDOS 
        JOptionPane.showMessageDialog(null,"LA CADENA ES "+cadena);
        JOptionPane.showMessageDialog(null, "el entero es "+entero);
        JOptionPane.showMessageDialog(null, "la letra es "+letra);
        JOptionPane.showMessageDialog(null,"el decimal es "+decimal);
    }
    
}
