package model;

public class Empresa {

  // Fields
  private int idEmpresa;
  private String nomeEmpresa;
  private String emailEmpresa;
  private String cnpj;

  // Constructors
  public Empresa() {
  };

  // Methods

  // Accessor methods

  public void setIdEmpresa(int idEmpresa) {
    this.idEmpresa = idEmpresa;
  }

  public int getIdEmpresa() {
    return idEmpresa;
  }

  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  public String getNomeEmpresa() {
    return nomeEmpresa;
  }

  public void setEmailEmpresa(String newVar) {
    emailEmpresa = newVar;
  }

  public String getEmailEmpresa() {
    return emailEmpresa;
  }

  public void setCnpj(String newVar) {
    cnpj = newVar;
  }

  public String getCnpj() {
    return cnpj;
  }

  // Other methods
  public void get() {
  }

  public void set() {
  }

}
