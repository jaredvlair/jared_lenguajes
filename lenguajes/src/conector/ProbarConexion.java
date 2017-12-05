/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conector;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarConexion {
    
    public static void main(String[] args) {
          Connection con=null;
        try{
        con= Conexion.conectarse("root","root");
            System.out.println("Te Conectaste");
            //AQUI VIENE QUERIES DE MYSQL
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("select * from tablita where id=1 ");
            //viene la traduccion
            ArrayList<Tablita> registros=new ArrayList<>();
            while(rs.next ()){
                Tablita t=new Tablita ();
                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                registros.add(t);
            }
            for (Tablita t:registros ){
                System.out.println("id"+t.getId()+"nombre"+t.getNombre() );
                
            }
            st.close();
        }catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver"+e.getMessage());
        }catch(SQLException e){
            
        }finally{
            
    try{
        if (con!=null)con.close();
    }catch(SQLException ex){
    
    }

    }
}
}