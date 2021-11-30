public class DeliciousFood extends Item implements Eatable{
  public DeliciousFood (String name, int price) {
    super(name, price);
  }

  @Override
  public int getTaxPrice () {
    return (int)(super.price * 1.08);
  }

  @Override
  public String getTastes () {
    return "Delicious";
  }
}
