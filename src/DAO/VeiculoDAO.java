package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.ConexaoSQL;
import model.Veiculo;

public class VeiculoDAO {
    public void cadastrarVeiculo(Veiculo veiculo){
        String sql = "INSERT INTO veiculo (id_veic, marca, modelo, id_combustivel, id_empresa, autonomia) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try{
            ps = ConexaoSQL.getConexao().prepareStatement(sql);
            ps.setInt(1, veiculo.getIdVeic());
            ps.setString(2, veiculo.getMarca());
            ps.setString(3, veiculo.getModelo());
            ps.setString(4, veiculo.getIdComb());
            ps.setInt(5, veiculo.getIdEmpresa());
            ps.setInt(6, veiculo.getAutonomia());

            ps.execute();
            ps.close();

        }catch (SQLException e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao cadastrar veiculo: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
    
}
