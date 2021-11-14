public abstract class Fruit {
  private double weight;

  public Fruit(double weight){
    this.weight = weight;
  }

  public double getWeight(){
    return this.weight;
  }

  abstract public String getColor();
}
