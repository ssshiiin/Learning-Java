package quiz;

public class Grape extends Fruit {
  public Grape () {
    super("Purple");
  }

  @Override
  public String getColor() {
    return super.color;
  }
}
