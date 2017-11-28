/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conector;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarConexion {
    
    public static void main(String[] args) {
          Connection con=null;
        try{
        con= Conexion.conectarse("root","");
            System.out.println("Te Conectaste");
            //AQUI VIENE QUERIES DE MYSQL
        }catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
        }catch(SQLException e){
            
        }finally{
            
    try{
        if (con!=null)con.close();
    }catch(SQLException ex){
    
    }

    }
}
}