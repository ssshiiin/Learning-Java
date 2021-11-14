import java.util.Random;

public class Area {
  public static void main(String[] args) {
    Random rnd = new Random();
    int r = rnd.nextInt(11);

    double pi = Math.PI;
    double result = Math.pow(r, 2) * pi;

    System.out.printf("The area of a circle with a radius of %d is %f\n", r, result);
  }
}
