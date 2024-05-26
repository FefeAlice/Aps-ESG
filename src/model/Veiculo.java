package model;


public class Veiculo {

  private int idVeiculo;
  private String marca;
  private String modelo;
  private String tipo;
  private int qntdVeiculo;
  private float combustivel;

  public Veiculo() {
  };

  public void setIdVeiculo(int newVar) {
    idVeiculo = newVar;
  }

  public int getIdVeiculo() {
    return idVeiculo;
  }

  public void setMarca(String newVar) {
    marca = newVar;
  }

  public String getMarca() {
    return marca;
  }

  public void setModelo(String newVar) {
    modelo = newVar;
  }

  public String getModelo() {
    return modelo;
  }

  public void setTipo(String newVar) {
    tipo = newVar;
  }

  public String getTipo() {
    return tipo;
  }

  public void setQntdVeiculo(int newVar) {
    qntdVeiculo = newVar;
  }

  public int getQntdVeiculo() {
    return qntdVeiculo;
  }

  public void setCombustivel(float newVar) {
    combustivel = newVar;
  }

  public float getCombustivel() {
    return combustivel;
  }

  public void get() {
  }

  public void set() {
  }

}
