/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author jared
 */
public class GeneradorUsuario {
    public static void main(String[] args) {
        //vamos a generar 5 usuarios
        Usuario u1=new Usuario();
        u1.setEdad(23);
        u1.setEmail("jaredqwe@gmail.com");
        u1.setNombre("juan");
        
        Usuario u2=new Usuario();
        u2.setEdad(21);
        u2.setEmail("jared1@gmail.com");
        u2.setNombre("max");
        
        Usuario u3=new Usuario();
        u3.setEdad(40);
        u3.setEmail("dqwe@gmail.com");
        u3.setNombre("juan");
        
        Usuario u4=new Usuario();
        u4.setEdad(23);
        u4.setEmail("jaredqwe@gmail.com");
        u4.setNombre("juan");
        
        Usuario u5=new Usuario();
        u5.setEdad(23);
        u5.setEmail("jaredqwe@gmail.com");
        u5.setNombre("juan");
        //generar un arreglo mutable
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        //vamos a ITERARLO para ve rlos nombres 
        for(Usuario u:usuarios){
            System.out.println("nombre: "+u.getNombre()+"email" + u.getEmail());
        }
        
    }
    
}
