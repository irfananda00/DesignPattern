public class Product {

  private String name;
  private String price;

  private Product(Builder b){
    name = b.name;
    price = b.price;
  }

  public static Builder newProduct(){
    return new Builder();
  }

  public String getDescription(){
    return name+" | price = "+price;
  }

  // sebagai pengganti parameter pada constructor di Product
  public static final class Builder{
    private String name;
    private String price;

    private Builder(){

    }

    public Builder name(String name){
      this.name = name;
      return this;
    }

    public Builder price(String price){
      this.price = price;
      return this;
    }

    public Product build(){
      return new Product(this);
    }

  }

}
