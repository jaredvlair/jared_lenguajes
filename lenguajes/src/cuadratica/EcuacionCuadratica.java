/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

/**
 *
 * @author jared
 */
public class EcuacionCuadratica {
        private float a;
        private float b;
        private float c;
        //primeo obtenemos el determinantw
        float determinante(){ 
                float det= (float)(Math.pow(b,2)-4*a*c);
                return det;
}
        public String raiz1(){
            float det=determinante();
            String sol= "raiz 1";
            if (det<0){
                sol="Raiz imaginaria";
            }else {
                float r1= (float)(-b+ Math.sqrt(det))/(2*a);
                sol="raiz 1: "+r1;
            }
            return sol;//siempre retornar 
        }
        
         public String raiz2(){
            float det=determinante();
            String sol= "raiz 2";
            if (det<0){
                sol="Raiz imaginaria";
            }else {
                float r2= (float)(-b- Math.sqrt(det))/(2*a);
                sol="raiz 2: "+r2;
            }
            return sol;//siempre retornar 
        }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
}


