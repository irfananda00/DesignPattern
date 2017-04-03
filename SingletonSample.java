public class SingletonSample {

  private static SingletonSample instance = null;
  public String text = "";

  private SingletonSample(){

  }

  // new SingletonSample() -> instance
  public static SingletonSample getInstance(){
    if(instance==null){
      instance = new SingletonSample();
    }
    return instance;
  }

  public void doThis(){
    System.out.println(text);
  }

}
