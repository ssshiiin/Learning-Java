public class Bmi {
  public static void printRisk(int age, double h, double w) {
    double def = (h / 100) * (h / 100);
    double bmi = w / def;
    System.out.printf("Your BMI: %f\n", bmi);
    if (bmi < 22) {
      if (age < 45) {
        System.out.printf("Your risk: Low\n");
      } else {
        System.out.printf("Your risk: Medium\n");
      }
    } else {
      if (age < 45) {
        System.out.printf("Your risk: Medium\n");
      } else {
        System.out.printf("Your risk: High\n");
      }
    }
  }

  public static void main(String[] args) {
    int age = 30;
    double h = 170.0;
    double w = 70.0;

    printRisk(age, h, w);
  }
}
