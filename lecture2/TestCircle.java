public class TestCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle(5.0, "green", 5, 10);
    Circle c2 = new Circle(3.0, "yellow", -3, 5);

    System.out.println(c1.getArea());
    System.out.println(c2.getCircumferense());
    System.out.println(c1.getDistance(c2));
  }
}