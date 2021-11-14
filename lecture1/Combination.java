public class Combination {
  public static int combination(int n, int r) {
    int num = 1;
    int den = 1;
    for (int i = 0; i < r; i++) {
      num *= n - i;
      den *= i + 1;
    }
    return num / den;
  }

  public static void main(String[] args) {
    int n = 10;
    int r = 3;
    int c = combination(n, r);
    System.out.printf("C(%d, %d) = %d\n", n, r, c);
  }
}