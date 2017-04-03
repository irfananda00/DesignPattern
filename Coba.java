public class Coba {

   public static void main(String []args) {
      //Singleton
      SingletonSample s = new SingletonSample(); // S1
      SingletonSample s = SingletonSample.getInstance(); // S1
      s.text = "sudah terisi";
      s.doThis();
      new Coba2().contoh(s);

      //Fluent Builder
      Product p = new Product("Samsung S8","10 jt");
      Product p = Product.newProduct()
                    .name("Samsung S8")
                    .price("10 jt")
                    .build();
      System.out.println(p.getDescription());

      //Dynamic Variable Type
      Peliharaan p = new Peliharaan<Anjing>(new Anjing());
      Anjing k = (Anjing) p.getPeliharaan();
      System.out.println(k.nama);

      //Building Factory
      Building b = BuildingFactory.getBuilding("House");
      System.out.println(b.getType());
   }
}
