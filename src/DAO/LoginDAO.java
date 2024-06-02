/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ConexaoSQL;

/**
 *
 * @author iriam
 */
public class LoginDAO {
    private ConexaoSQL conexao;
    private Connection conn;
    
    public LoginDAO(){
        this.conexao = new ConexaoSQL();
        this.conn = this.conexao.getConexao();
    }
    public Usuario logar(String cpf, String senha){
        String sql = "SELECT * FROM funcionario WHERE cpf_cnpj = ? AND senha = ?";
        try{
            PreparedStatement ps = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, cpf);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            Usuario logar = new Usuario();
            rs.first();
            logar.setNome(rs.getString("nome"));
            logar.getNome();
            logar.setSobrenome(rs.getString("sobrenome"));
            logar.getSobrenome();
            logar.setIdEmpresa(rs.getInt("id_empresa"));
            logar.getIdEmpresa();
            logar.setIdFunc(rs.getInt("id_func"));
            logar.getIdFunc();
            logar.setCpf(rs.getString("cpf_cnpj"));
            logar.getCpf();
            
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Bem vindo!");
            return logar;
            
        }catch (Exception e){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao tentar logar: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
}
