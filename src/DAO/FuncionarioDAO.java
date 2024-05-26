package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ConexaoSQL;
import model.Funcionario;

public class FuncionarioDAO {
    public void cadastrarFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario (nome, sobrenome, cpf_cnpj, senha, id_empresa, id_func) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try{
            ps = ConexaoSQL.getConexao().prepareStatement(sql);
            ps.setString(1, funcionario.getNomePessoa());
            ps.setString(2, funcionario.getSobrenomePessoa());
            ps.setString(3, funcionario.getCpf());
            ps.setString(4, funcionario.getSenha());
            ps.setInt(5, funcionario.getIdEmpresa());
            ps.setInt(6, funcionario.getIdFuncionario());

            ps.execute();
            ps.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
