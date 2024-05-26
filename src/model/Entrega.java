package model;


public class Entrega {

  // Fields

  private float km;
  private int rotas;

  // Constructors

  public Entrega() {
  };

  // Methods

  // Accessor methods

  public void setKm(float newVar) {
    km = newVar;
  }

  public float getKm() {
    return km;
  }

  public void setRotas(int newVar) {
    rotas = newVar;
  }

  public int getRotas() {
    return rotas;
  }

  // Other methods

  public int qntdRotas() {
    return rotas;
  }

}
