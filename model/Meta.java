
public class Meta {

  private int mesAno;
  private float meta;

  public Meta() {
  };

  public void setMesAno(int newVar) {
    mesAno = newVar;
  }

  public int getMesAno() {
    return mesAno;
  }

  public void setMeta(float newVar) {
    meta = newVar;
  }

  public float getMeta() {
    return meta;
  }

  public float metaCons() {
    return mesAno;
  }

}
