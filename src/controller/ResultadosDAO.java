/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author iriam
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ConexaoSQL;
import model.Meta;
import model.Veiculo;

public class ResultadosDAO {
    private int idFunc;
    private int idEmp;
    private float emissao;

    public float getEmissao() {
        return emissao;
    }

    public void setEmissao(float emissao) {
        this.emissao = emissao;
    }
    
    
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
    
    private ConexaoSQL conexao;
    private Connection conn;
       
    public ResultadosDAO(){
        this.conexao = new ConexaoSQL();
        this.conn = this.conexao.getConexao();
    }
    
    public void enviarResultado(Meta resultado, int idVeic) throws SQLException{
        
        String sql1 = "SELECT autonomia, id_combustivel FROM veiculo WHERE id_veic = ? AND id_empresa = ?";
        PreparedStatement pds = this.conn.prepareStatement(sql1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        pds.setInt(1, idVeic);
        pds.setInt(2, idEmp);
        ResultSet rs = pds.executeQuery();
        Veiculo veic = new Veiculo();
        rs.first();
        veic.setAutonomia(rs.getInt("autonomia"));
        veic.setIdComb(rs.getString("id_combustivel"));
        
        if (null!= veic.getIdComb())switch (veic.getIdComb()) {
            case "Gasolina":
                setEmissao(2.28f);
                break;
            case "Diesel":
                setEmissao(2.67f);
                break;
            case "Etanol":
                setEmissao(2.4f);
                break;
            case "Gas natural":
                setEmissao(2.3f);
                break;
            default:
                break;
        }
        
        String sql = "INSERT INTO resultados (id_empresa, id_func, meta_sem, resultado_sem, semana_ref, mes_referencia, ano_referncia) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try{
            ps = ConexaoSQL.getConexao().prepareStatement(sql);
            ps.setInt(1, resultado.getIdEmp());
            ps.setInt(2, resultado.getIdFunc());
            ps.setFloat(3, resultado.getMetaSem());
            resultado.setResultadoSem((resultado.getKmSem()/veic.getAutonomia())*getEmissao()/resultado.getEntregaSem());
            ps.setFloat(4, resultado.getResultadoSem());
            ps.setInt(5, resultado.getSemana());
            ps.setInt(6, resultado.getMes());
            ps.setInt(7, resultado.getAno());
            JFrame frame = new JFrame();
            
            System.out.println(veic.getIdComb());
            System.out.println(resultado.getResultadoSem());
            System.out.println(veic.getAutonomia());
            System.out.println(getEmissao());
            
            JOptionPane.showMessageDialog(frame, "Resultados enviados com sucesso! \n Resultado dessa semana: " + resultado.getResultadoSem() + "Meta para semana que vem: " + (resultado.getResultadoSem()*0.9));
            
            ps.execute();
            ps.close();
            
        }catch (SQLException e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Erro ao enviar resultados: \n" + e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
}
