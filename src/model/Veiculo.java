package model;


public class Veiculo {

  private int idVeic;
  private String marca;
  private String modelo;
  private int idComb;
  private int autonomia;

  public Veiculo() {
  };

    public int getIdVeic() {
        return idVeic;
    }

    public void setIdVeic(int idVeic) {
        this.idVeic = idVeic;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdComb() {
        return idComb;
    }

    public void setIdComb(int idComb) {
        this.idComb = idComb;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    

}