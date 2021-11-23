package quiz;

abstract public class Fruit{
  public String color;
  
  public Fruit (String color) {
    this.color = color;
  }

  abstract public String getColor();
}