package model;


public class Pessoa {

  private String nomePessoa;
  private String sobrenomePessoa;
  private String cpf;
  private String telefonePessoa;

  public Pessoa() {
  };

  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  public String getNomePessoa() {
    return nomePessoa;
  }

  public void setSobrenomePessoa(String sobrenomePessoa){
    this.sobrenomePessoa = sobrenomePessoa;
  }

  public String getSobrenomePessoa(){
    return sobrenomePessoa;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setTelefonePessoa(String telefonePessoa) {
    this.telefonePessoa = telefonePessoa;
  }

  public String getTelefonePessoa() {
    return telefonePessoa;
  }

}
