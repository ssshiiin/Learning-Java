import java.util.Scanner;

public class FactTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    for (int i = 1; i < 10; i++) {
      int result = i * num;
      System.out.printf("%d * %d = %d\n", num, i, result);
    }
  }
}
