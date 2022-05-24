/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alvar
 */

    public class Conexion {
    private static final String URL="jdbc:postgresql://ec2-34-231-177-125.compute-1.amazonaws.com:5432/d89eobdd82c11p";
    private static final String DRIVER ="org.postgresql.Driver";
    private static final String PASS="6f8cb5d9f1bdc2ed50c02cf489907b7561b749e62e0b83f8142277e61a57beb7";
    private static final String USER="wmzsmytqxzgnvw";
    private static Connection cx = null;
    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
    return cx;
    }
        public static void main(String[] args) {
            if(Conexion.getConex()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }

        }
}

