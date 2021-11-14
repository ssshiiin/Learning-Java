import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class janken {
  public static void main(String[] args) {
    System.out.println("あなたの手は？0: グー, 1: チョキ, 2: パー");
    try {
      Scanner in = new Scanner(System.in);
      int inputted = in.nextInt();
      System.out.printf("あなたの手 : %d\n", inputted);

      Random r = new Random();
      int RandomNum = r.nextInt(3);
      System.out.printf("コンピュータの手 : %d\n", RandomNum);

      switch (inputted) {
        case 0:
          if (RandomNum == 0) {
            System.out.println("引き分け");
          } else if (RandomNum == 1) {
            System.out.println("あなたの勝ち");
          } else {
            System.out.println("コンピュータの勝ち");
          }
          break;
        case 1:
          if (RandomNum == 0) {
            System.out.println("コンピュータの勝ち");
          } else if (RandomNum == 1) {
            System.out.println("引き分け");
          } else {
            System.out.println("あなたの勝ち");
          }
          break;
        case 2:
          if (RandomNum == 0) {
            System.out.println("あなたの勝ち");
          } else if (RandomNum == 1) {
            System.out.println("コンピュータの勝ち");
          } else {
            System.out.println("引き分け");
          }
          break;
        default:
          System.out.println("0, 1, 2 を入力してください");
      }
    } catch (InputMismatchException ex) {
      System.out.println("数字を入力してくだい");
    }
  }
}
