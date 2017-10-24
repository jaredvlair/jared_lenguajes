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
public class Entregable6 {
     public static void main(String[] args) {
        //vamos a generar un arreglo simple
        int x[]={20,-23,18,3,56,-13,34};
        System.out.println("La magnitud es  "+x.length );
        //para acceder a un elemento hacemos lo siguiente
        System.out.println("En el indice 0 esta "+x[2]);
        int []y={4,12,45,23,1,2};
        int[]z=new int[11]; //da el espacio para tener los arreglos
        z[0]=-4;
        z[1]=12;
        z[2]=45;
        z[3]=23;
        z[4]=1;
        z[5]=2;
        //vamos a iterar el arreglo z usando un ciclo for 
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
           
        }
        //aqui vemos el ciclo for mejorado
        for(int valor:z){
            System.out.println("Evolucionando "+valor);
        }
        String mensaje="Buenas noches como la extraño a diana, si supieras cuanto te quiero y deseo , estas siempre en mi pensamiento , a decir verdad dudo que este en el tuyo, o amada mia quisiera poder acariciarte y decirte lo mas bello pero solo soy un hombre enamorado de la unica chica que he encontrado , de una forma sublime , interesante y atractiva";
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
