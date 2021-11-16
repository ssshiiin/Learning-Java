package q2;

import java.util.Scanner;

public class QuestionTwo {
  public static void main(String[] argv){
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
    for (;;) {
      if (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        sum += num;
        continue;
      } else {
        System.out.printf("%d\n", sum);
        break;
      }
    }
  }
}
