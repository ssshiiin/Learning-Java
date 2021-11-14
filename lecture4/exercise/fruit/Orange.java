package exercise.fruit;

public class Orange extends Fruit{
  @Override
  public void peel(){
    super.state = "membraned";
  }
}
