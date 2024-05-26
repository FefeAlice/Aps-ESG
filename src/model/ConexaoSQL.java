/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iriam
 */
public class ConexaoSQL {
    private static final String url = "jdbc:mysql://localhost:3306/green_track";
    private static final String user = "root";
    private static final String password = "root";
    
    
    private static Connection conn;

    public static Connection getConexao(){
        try{
            if (conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }
        }catch(SQLException e){
            System.out.println("Erro ao conectar" + e.getMessage());
            return null;
        }
    }
}
