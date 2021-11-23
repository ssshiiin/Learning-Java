package quiz;

public class Apple extends Fruit{
  public Apple () {
    super("Red");
  }

  @Override
  public String getColor () {
    return super.color;
  }
}
