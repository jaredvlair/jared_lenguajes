/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutables;

/**
 *
 * @author jared
 */
public class Arreglos1 {
    public static void main(String[] args) {
        //vamos a generar un arreglo simple
        int x[]={12,-4,7};
        System.out.println("EL TAMAÑO ES "+x.length );
        //para acceder a un elemento hacemos lo siguiente
        System.out.println("En el indice 0 esta "+x[2]);
        int []y={2,4,5};
        int[]z=new int[3]; //da el espacio para tener los arreglos
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        //vamos a iterar el arreglo z usando un ciclo for 
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
           
        }
        //aqui vemos el ciclo for mejorado
        for(int valor:z){
            System.out.println("mejorado "+valor);
        }
        String mensaje="hoal como estas";
                byte []w= mensaje.getBytes();
                System.out.println("tamaño"+w.length);
                String codificado=" ";
                for (byte b:w){
                    System.out.println("El byte es"+b);
                    codificado=codificado+b;
                    
                }
                System.out.println("EL MENSAJE CODIFICADO ES ");
                System.out.println(codificado);
                        
                        
    }
    
}
