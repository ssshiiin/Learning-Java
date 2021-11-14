public class Apple extends Fruit implements Sellable{
  private int price;
  public Apple (double weight, int price) {
    super(weight);
    this.price = price;
  }

  @Override 
  public String getColor(){
    return "Red";
  }

  @Override 
  public int getPrice(){
    return this.price;
  }
}
