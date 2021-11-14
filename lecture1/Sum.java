import java.util.Scanner;

public class Sum {
  public static int add(int left, int right) {
    return left + right;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int left = Integer.valueOf(in.nextLine());
    int right = Integer.valueOf(in.nextLine());

    int result = add(left, right);

    System.out.printf("%d plus %d = %d\n", left, right, result);
  }
}
