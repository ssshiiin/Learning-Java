import java.util.Scanner;

public class DecToBin {
  public static int decToBin(int dec) {
    int result = 0;
    for (int i = 0; !(dec < 1); i++) {
      if (dec % 2 == 1) {
        result += 1 * pow(i);
      }
      dec /= 2;
    }
    return result;

  }

  public static int pow(int p) {
    int result = 1;
    for (int i = 0; i < p; i++) {
      result *= 10;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("数字を入力してください");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();

    int result = decToBin(input);
    System.out.println(result);
  }
}
