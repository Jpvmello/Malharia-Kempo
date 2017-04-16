/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malharia.kempo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JeanPablo
 */
public class MalhariaKempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conexao = null;
        
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/malharia_kempo","root","j1p2v3m4");
            if (conexao != null)
                System.out.println("Conectado!");
        } catch (SQLException e) {
            System.out.println("Não conectado!");
        }
    }
    
}
