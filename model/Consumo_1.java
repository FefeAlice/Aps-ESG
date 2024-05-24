
public class Consumo_1 {

  // Fields
  private float consumoMes;
  private int mesAno;
  private float valorEmissao;

  // Constructors
  public Consumo_1() {
  };

  // Methods

  // Accessor methods

  public void setConsumoMes(float newVar) {
    consumoMes = newVar;
  }

  public float getConsumoMes() {
    return consumoMes;
  }

  public void setMesAno(int newVar) {
    mesAno = newVar;
  }

  public int getMesAno() {
    return mesAno;
  }

  public void setValorEmissao(float newVar) {
    valorEmissao = newVar;
  }

  public float getValorEmissao() {
    return valorEmissao;
  }

  public float calculoEmissa() {
    return consumoMes;
  }

}
