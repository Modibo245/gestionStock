/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionstock;

import java.sql.*;



public class ConnexionDB {
    Connection con = null;
    public static Connection connexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/gestion_stock","root","");
                        if (con != null)
        System.out.println("connexion établie");
                        else 
        System.out.println("problème de connexion àla base");
                        
        return con;
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Impossible de se connecter !");
            return null;
        }
    
    }
}
