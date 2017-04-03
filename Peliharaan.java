public class Peliharaan<T> {

  private T hewan;

  public Peliharaan(T h){
    this.hewan = h;
  }

  public T getPeliharaan(){
    return hewan;
  }
}
