import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
  public static void main(String[] args) {
    try {
      System.out.println("input an integer");
      Scanner in = new Scanner(System.in);
      String inputted = in.nextLine();
      System.out.println("Number is " + Integer.valueOf(inputted));
    } catch (NumberFormatException ex) {
      System.out.println("Please input integer");
    } finally {
      System.out.println("finished");
    }
  }
}
