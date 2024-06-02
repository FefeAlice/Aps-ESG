/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author iriam
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import beans.Usuario;
import model.ConexaoSQL;
import model.Meta;

public class ResultadosDAO {
    public void enviarResultado(Meta resultado){
        String sql = "INSERT INTO meta (id_empresa, id_func, meta_sem, resultado_sem, semana_ref, mes_ref, ano_ref) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try{
            ps = ConexaoSQL.getConexao().prepareStatement(sql);
            ps.setInt(1, resultado.getIdEmp() = );
            ps.setInt(2, ());
            ps.setFloat(3, resultado.getMetaSem());
            ps.setFloat(4, resultado.getResultadoSem());
            ps.setInt(5, resultado.getSemana());
            ps.setInt(6, resultado.getMes());
            ps.setInt(7, resultado.getAno());
            

            ps.execute();
            ps.close();

        }catch (SQLException e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao cadastrar veiculo: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
}