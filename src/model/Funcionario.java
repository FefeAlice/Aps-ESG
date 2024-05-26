package model;


public class Funcionario extends Pessoa{

  protected String senha;
  private int idFuncionario;
  private int idEmpresa;

  public Funcionario() {
  };

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getSenha() {
    return senha;
  }

  public void setIdFuncionario(int idFuncionario) {
    this.idFuncionario = idFuncionario;
  }

  public int getIdFuncionario() {
    return idFuncionario;
  }

  public void setIdEmpresa(int idEmpresa){
    this.idEmpresa = idEmpresa;
  }

  public int getIdEmpresa(){
    return idEmpresa;
  }
}
