/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ConexaoSQL;

/**
 *
 * @author iriam
 */
public class CadastroDAO {
    private ConexaoSQL conexao;
    private Connection conn;
    
    public CadastroDAO(){
        this.conexao = new ConexaoSQL();
        this.conn = this.conexao.getConexao();
    }
    public void cadastrarFuncionario(Cadastro cadastro){

        try{
            PreparedStatement ps = this.conn.prepareStatement("");
            String sql1 = "INSERT INTO funcionario(nome, sobrenome, cpf_cnpj, senha, id_empresa, id_func) VALUES" + "(?, ?, ?, ?, ?)";
            String sql2 = "INSERT INTO telefone(id_func, telefone) VALUES" + "(?, ?)";
            String sql3 = "INSERT INTO telefone(id_func, email) VALUES" + "(?, ?)";
            
            ps = ConexaoSQL.getConexao().prepareStatement(sql1);
            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getSobrenome());
            ps.setString(3, cadastro.getCpf());
            ps.setString(4, cadastro.getSenha());
            ps.setInt(5, cadastro.getIdEmpresa());
            ps.setInt(6, cadastro.getIdFunc());
            
            ps = ConexaoSQL.getConexao().prepareStatement(sql2);
            ps.setInt(1, cadastro.getIdFunc());
            ps.setString(2, cadastro.getTelefone());
            
            ps = ConexaoSQL.getConexao().prepareStatement(sql3);
            ps.setInt(1, cadastro.getIdFunc());
            ps.setString(2, cadastro.getEmail());
            

            ps.execute();
            ps.close();

        }catch (SQLException e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao tentar se cadastrar: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
        
        /*(Funcionario funcionario, String getNomeCad, String getSobrenomePessoaCad, String getCpfCad, String getSenhaCad){
        
        Funcionario f = new Funcionario();
        f.setNomePessoa(getNomeCad);
        f.setSobrenomePessoa(getSobrenomePessoaCad);
        f.setCpf(getCpfCad);
        f.setSenha(getSenhaCad);
        String sql = "INSERT INTO funcionario (nome, sobrenome, cpf_cnpj, senha, id_empresa, id_func) VALUES (?, ?, ?, ?, ?, ?)";

        */
    }
    
    public Cadastro getCadastro(String cpf){
        String sql = "SELECT cpf_cnpj, senha FROM funcionario WHERE cpf = ?";
        try{
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            Cadastro cadastro = new Cadastro();
            rs.first();
            cadastro.setCpf(cpf);
            cadastro.setSenha(rs.getString("senha"));
            return cadastro;
            
        }catch (Exception e){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao tentar logar: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
}
