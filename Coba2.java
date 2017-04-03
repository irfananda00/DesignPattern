public class Coba2 {

   public void contoh(SingletonSample st) {
      //Singleton
      // SingletonSample s = new SingletonSample(); //S2
      SingletonSample s = SingletonSample.getInstance(); //S1
      // SingletonSample s = st; //S1
      s.doThis();
   }
}
