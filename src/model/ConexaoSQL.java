/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao conectar: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
}
