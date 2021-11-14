package exercise.asignment1;

public class Factorial implements Function{
  protected final int num;
  public Factorial(int n){
    this.num = n;
  }

  @Override
  public int calc(){
    int result = 1;
    for(int i=1; i < this.num; i++){
      result *= i;
    }

    return result;
  }

}
