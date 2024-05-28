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
 * Classe que vai ficar responsável pelo programa ser conectado ao BD
 * @author iriam
 */
public class ConexaoSQL {
    
    
    
    private static Connection conn;

    /**
     *
     * @return
     */
    public static Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/green_track?serverTimezone=UTC",
                    "N085FD4",
                    "N085FD4"
            );
            return conn;
            
        }catch(SQLException e){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao conectar: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
}
