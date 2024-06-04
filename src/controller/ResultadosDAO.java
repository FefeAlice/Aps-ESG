/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author iriam
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Usuario;
import model.ConexaoSQL;
import model.Meta;

public class ResultadosDAO {
    private int idFunc;
    private int idEmp;
    
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc; //Integer.parseInt(LoginDAO.dados[4]);
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp; //Integer.parseInt(LoginDAO.dados[3]);
    }
    
    
    
    public void enviarResultado(Meta resultado){
        String sql1 = "SELECT ";
        String sql = "INSERT INTO meta (id_empresa, id_func, meta_sem, resultado_sem, semana_ref, mes_ref, ano_ref) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try{
            ps = ConexaoSQL.getConexao().prepareStatement(sql);
            ps.setInt(1, resultado.getIdEmp());
            ps.setInt(2, resultado.getIdFunc());
            ps.setFloat(3, resultado.getMetaSem());
            ps.setFloat(4, resultado.getResultadoSem());
            ps.setInt(5, resultado.getSemana());
            ps.setInt(6, resultado.getMes());
            ps.setInt(7, resultado.getAno());
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Resultados enviados com sucesso! \n Resultado dessa semana: " + "Meta para semana que vem: ");
            
            ps.execute();
            ps.close();

        }catch (SQLException e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao enviar resultados: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
}
