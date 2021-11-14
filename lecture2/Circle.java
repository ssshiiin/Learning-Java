public class Circle {
  int pointX;
  int pointY;
  double radios;
  String color;

  public Circle(double r, String c, int x, int y) {
    this.radios = r;
    this.color = c;
    this.pointX = x;
    this.pointY = y;
  }

  public double getArea() {
    return this.radios * this.radios * Math.PI;
  }

  public double getCircumferense() {
    return this.radios * Math.PI;
  }

  public double getDistance(Circle circle) {
    double x1 = this.pointX;
    double y1 = this.pointY;

    double x2 = circle.pointX;
    double y2 = circle.pointY;

    double Xlen = Math.abs(x1 - x2);
    double Ylen = Math.abs(y1 - y2);

    return Math.sqrt(Math.pow(Xlen, 2) + Math.pow(Ylen, 2));
  }
}