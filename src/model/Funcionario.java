package model;


public class Funcionario extends Pessoa{

  protected String senha;
  private int idFunc;
  private int idEmpresa;
  private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  public Funcionario() {
  };

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getSenha() {
    return senha;
  }

  public void setIdFunc(int idFunc) {
    this.idFunc = idFunc;
  }

  public int getIdFunc() {
    return idFunc;
  }

  public void setIdEmpresa(int idEmpresa){
    this.idEmpresa = idEmpresa;
  }

  public int getIdEmpresa(){
    return idEmpresa;
  }

    @Override
    public String getTelefonePessoa() {
        return super.getTelefonePessoa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTelefonePessoa(String telefonePessoa) {
        super.setTelefonePessoa(telefonePessoa); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCpf() {
        return super.getCpf(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getSobrenomePessoa() {
        return super.getSobrenomePessoa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSobrenomePessoa(String sobrenomePessoa) {
        super.setSobrenomePessoa(sobrenomePessoa); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNomePessoa() {
        return super.getNomePessoa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNomePessoa(String nomePessoa) {
        super.setNomePessoa(nomePessoa); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  
  
}
