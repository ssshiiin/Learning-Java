public class Book extends Item{
  public Book (String name, int price) {
    super(name, price);
  } 

  @Override
  public int getTaxPrice () {
    return (int)(super.price * 1.1);
  }
}
